package typingsSlinky.jsrsasign.mod.KJUR

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsrsasign.anon.AlgString
import typingsSlinky.jsrsasign.anon.Aud
import typingsSlinky.jsrsasign.anon.B64
import typingsSlinky.jsrsasign.anon.Hex
import typingsSlinky.jsrsasign.anon.Utf8
import typingsSlinky.jsrsasign.jsrsasign.KJUR.jws.JWS.JWSResult
import typingsSlinky.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typingsSlinky.jsrsasign.jsrsasignNumbers.`0`
import typingsSlinky.jsrsasign.jsrsasignNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's JSON Web Signature/Token(JWS/JWT) library name space
  *
  * This namespace provides the following JWS/JWS related classes.
  *
  * - `KJUR.jws.JWS` - JSON Web Signature/Token(JWS/JWT) class
  * - `KJUR.jws.JWSJS` - JWS JSON Serialization(JWSJS) class
  * - `KJUR.jws.IntDate` - UNIX origin time utility class
  */
object jws {
  
  /**
    * IntDate class for time representation for JSON Web Token(JWT)
    * @description
    * Utility class for IntDate which is integer representation of UNIX origin time
    * used in JSON Web Token(JWT).
    */
  object IntDate {
    
    /**
      * get UNIX origin time from by string
      * @param s string of time representation
      * @return UNIX origin time in seconds for argument 's'
      * @throws "unsupported format: s" when malformed format
      * @description
      * This method will accept following representation of time.
      *
      * - now - current time
      * - now + 1hour - after 1 hour from now
      * - now + 1day - after 1 day from now
      * - now + 1month - after 30 days from now
      * - now + 1year - after 365 days from now
      * - YYYYmmDDHHMMSSZ - UTC time (ex. 20130828235959Z)
      * - number - UNIX origin time (seconds from 1970-01-01 00:00:00) (ex. 1377714748)
      *
      */
    @JSImport("jsrsasign", "KJUR.jws.IntDate.get")
    @js.native
    def get(s: String): Double = js.native
    
    /**
      * get UNIX origin time of current time
      * @return UNIX origin time for current time
      * @description
      * This method provides UNIX origin time for current time
      * @example
      * KJUR.jws.IntDate.getNow() => 1478...
      */
    @JSImport("jsrsasign", "KJUR.jws.IntDate.getNow")
    @js.native
    def getNow(): Double = js.native
    
    /**
      * get UNIX origin time from Zulu time representation string
      * @param s string of Zulu time representation (ex. 20151012125959Z)
      * @return UNIX origin time in seconds for argument 's'
      * @throws "unsupported format: s" when malformed format
      * @description
      * This method provides UNIX origin time from Zulu time.
      * Following representations are supported:
      *
      * - YYYYMMDDHHmmSSZ - GeneralizedTime format
      * - YYMMDDHHmmSSZ - UTCTime format. If YY is greater or equal to
      * 50 then it represents 19YY otherwise 20YY.
      *
      * @example
      * KJUR.jws.IntDate.getZulu("20151012125959Z") => 1478...
      * KJUR.jws.IntDate.getZulu("151012125959Z") => 1478...
      */
    @JSImport("jsrsasign", "KJUR.jws.IntDate.getZulu")
    @js.native
    def getZulu(s: String): Double = js.native
    
    /**
      * get UTC time string from UNIX origin time value
      * @param intDate UNIX origin time value (ex. 1478...)
      * @return UTC time string
      * @description
      * This method provides UTC time string for UNIX origin time value.
      * @example
      * KJUR.jws.IntDate.intDate2UTCString(1478...) => "2015 Oct ..."
      */
    @JSImport("jsrsasign", "KJUR.jws.IntDate.intDate2UTCString")
    @js.native
    def intDate2UTCString(intDate: Double): String = js.native
    
    /**
      * get UTC time string from UNIX origin time value
      * @param intDate UNIX origin time value (ex. 1478...)
      * @return Zulu time string
      * @description
      * This method provides Zulu time string for UNIX origin time value.
      * @example
      * KJUR.jws.IntDate.intDate2UTCString(1478...) => "20151012...Z"
      */
    @JSImport("jsrsasign", "KJUR.jws.IntDate.intDate2Zulu")
    @js.native
    def intDate2Zulu(intDate: Double): String = js.native
  }
  
  /**
    * JSON Web Signature(JWS) class.
    * @see ['jwjws'(JWS JavaScript Library) home page](https://kjur.github.io/jsjws/)
    * @see ['jwrsasign'(RSA Sign JavaScript Library) home page](https://kjur.github.io/jsrsasigns/)
    * @see [IETF I-D JSON Web Algorithms (JWA)](http://tools.ietf.org/html/draft-ietf-jose-json-web-algorithms-14)
    * @description
    * This class provides JSON Web Signature(JWS)/JSON Web Token(JWT) signing and validation.
    *
    * __METHOD SUMMARY__
    *
    * Here are the major methods of the `KJUR.jws.JWS` class.
    *
    * - __SIGN__
    *
    * - `KJUR.jws.JWS.sign` - sign JWS
    *
    * - __VERIFY__
    *
    * - `KJUR.jws.JWS.verify` - verify JWS signature
    * - `KJUR.jws.JWS.verifyJWT` - verify properties of JWT token at specified time
    *
    * - __UTILITY__
    *
    * - `KJUR.jws.JWS.getJWKthumbprint` - get RFC 7638 JWK thumbprint
    * - `KJUR.jws.JWS.isSafeJSONString` - check whether safe JSON string or not
    * - `KJUR.jws.JWS.readSafeJSONString` - read safe JSON string only
    *
    * __SUPPORTED SIGNATURE ALGORITHMS__
    *
    * Here is supported algorithm names for `KJUR.jws.JWS.sign` and
    * `KJUR.jws.JWS.verify` methods.
    *
    * |alg value|spec requirement|jsjws support|
    * |:--------|:---------------|:------------|
    * |HS256|REQUIRED|SUPPORTED|
    * |HS384|OPTIONAL|SUPPORTED|
    * |HS512|OPTIONAL|SUPPORTED|
    * |RS256|RECOMMENDED|SUPPORTED|
    * |RS384|OPTIONAL|SUPPORTED|
    * |RS512|OPTIONAL|SUPPORTED|
    * |ES256|RECOMMENDED+|SUPPORTED|
    * |ES384|OPTIONAL|SUPPORTED|
    * |ES512|OPTIONAL|-|
    * |PS256|OPTIONAL|SUPPORTED|
    * |PS384|OPTIONAL|SUPPORTED|
    * |PS512|OPTIONAL|SUPPORTED|
    * |none|REQUIRED|SUPPORTED(signature generation only)|
    *
    * __NOTE1__
    *
    * HS384 is supported since jsjws 3.0.2 with jsrsasign 4.1.4.
    *
    * __NOTE2__
    *
    * Some deprecated methods have been removed since jws 3.3 of jsrsasign 4.10.0.
    * Removed methods are following:
    *
    * - `JWS.verifyJWSByNE`
    * - `JWS.verifyJWSByKey`
    * - `JWS.generateJWSByNED`
    * - `JWS.generateJWSByKey`
    * - `JWS.generateJWSByP1PrvKey`
    *
    * @example
    * // JWS signing
    * sJWS = KJUR.jws.JWS.sign(null, '{"alg":"HS256", "cty":"JWT"}', '{"age": 21}', {"utf8": "password"});
    * // JWS validation
    * isValid = KJUR.jws.JWS.verify('eyJjdHkiOiJKV1QiLCJhbGc...', {"utf8": "password"});
    * // JWT validation
    * isValid = KJUR.jws.JWS.verifyJWT('eyJh...', {"utf8": "password"}, {
    *   alg: ['HS256', 'HS384'],
    *   iss: ['http://foo.com']
    * });
    */
  object JWS {
    
    /**
      * get Encoed Signature Value from JWS string.
      * @param sJWS JWS signature string to be verified
      * @return string of Encoded Signature Value
      * @throws if sJWS is not comma separated string such like "Header.Payload.Signature".
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.getEncodedSignatureValueFromJWS")
    @js.native
    def getEncodedSignatureValueFromJWS(sJWS: String): String = js.native
    
    /**
      * get RFC 7638 JWK thumbprint from JWK object
      * @param o JWK object to be calculated thumbprint
      * @return Base64 URL encoded JWK thumbprint value
      * @description
      * This method calculates JWK thumbprint for specified JWK object
      * as described in [RFC 7638](https://tools.ietf.org/html/rfc7638).
      * It supports all type of "kty". (i.e. "RSA", "EC" and "oct"
      * (for symmetric key))
      * Working sample is [here](https://kjur.github.io/jsrsasign/sample/tool_jwktp.html).
      * @example
      * jwk = {"kty":"RSA", "n":"0vx...", "e":"AQAB", ...};
      * thumbprint = KJUR.jws.JWS.getJWKthumbprint(jwk);
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.getJWKthumbprint")
    @js.native
    def getJWKthumbprint(o: JsonWebKey): String = js.native
    
    /**
      * check whether item is included by array
      * @param item check whether item is included by array
      * @param a check whether item is included by array
      * @return check whether item is included by array
      * This method verifies whether an item is included by an array.
      * It doesn't care about item ordering in an array.
      * @example
      * KJUR.jws.JWS.inArray('b', ['b', 'c', 'a']) => true
      * KJUR.jws.JWS.inArray('a', ['b', 'c', 'a']) => true
      * KJUR.jws.JWS.inArray('a', ['b', 'c']) => false
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.inArray")
    @js.native
    def inArray(item: String, a: js.Array[String]): Boolean = js.native
    
    /**
      * check whether array is included by another array
      * @param a1 check whether set a1 is included by a2
      * @param a2 check whether set a1 is included by a2
      * @return check whether set a1 is included by a2
      * This method verifies whether an array is included by another array.
      * It doesn't care about item ordering in a array.
      * @example
      * KJUR.jws.JWS.includedArray(['b'], ['b', 'c', 'a']) => true
      * KJUR.jws.JWS.includedArray(['a', 'b'], ['b', 'c', 'a']) => true
      * KJUR.jws.JWS.includedArray(['a', 'b'], ['b', 'c']) => false
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.includedArray")
    @js.native
    def includedArray(a1: js.Array[String], a2: js.Array[String]): Boolean = js.native
    
    /**
      * check whether a String "s" is a safe JSON string or not.
      * If a String "s" is a malformed JSON string or an other object type
      * this returns 0, otherwise this returns 1.
      * @param s JSON string
      * @return 1 or 0
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.isSafeJSONString")
    @js.native
    def isSafeJSONString(s: String): `0` | `1` = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.isSafeJSONString")
    @js.native
    def isSafeJSONString(s: String, h: js.UndefOr[scala.Nothing], p: String): `0` | `1` = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.isSafeJSONString")
    @js.native
    def isSafeJSONString(s: String, h: js.Object): `0` | `1` = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.isSafeJSONString")
    @js.native
    def isSafeJSONString(s: String, h: js.Object, p: String): `0` | `1` = js.native
    
    /** static associative array of general signature algorithm name from JWS algorithm name */
    object jwsalg2sigalg {
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.ES256")
      @js.native
      def ES256: String = js.native
      @scala.inline
      def ES256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ES256")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.ES384")
      @js.native
      def ES384: String = js.native
      @scala.inline
      def ES384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ES384")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.HS256")
      @js.native
      def HS256: String = js.native
      @scala.inline
      def HS256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HS256")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.HS384")
      @js.native
      def HS384: String = js.native
      @scala.inline
      def HS384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HS384")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.HS512")
      @js.native
      def HS512: String = js.native
      @scala.inline
      def HS512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HS512")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.PS256")
      @js.native
      def PS256: String = js.native
      @scala.inline
      def PS256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PS256")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.PS384")
      @js.native
      def PS384: String = js.native
      @scala.inline
      def PS384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PS384")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.PS512")
      @js.native
      def PS512: String = js.native
      @scala.inline
      def PS512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PS512")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.RS256")
      @js.native
      def RS256: String = js.native
      @scala.inline
      def RS256_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RS256")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.RS384")
      @js.native
      def RS384: String = js.native
      @scala.inline
      def RS384_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RS384")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.RS512")
      @js.native
      def RS512: String = js.native
      @scala.inline
      def RS512_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RS512")(x.asInstanceOf[js.Any])
      
      @JSImport("jsrsasign", "KJUR.jws.JWS.jwsalg2sigalg.none")
      @js.native
      def none: String = js.native
      @scala.inline
      def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
    }
    
    /**
      * parse header and payload of JWS signature
      * @param sJWS string of JWS signature to parse
      * @return associative array of parsed header and payload. See below.
      * @throws if sJWS is malformed JWS signature
      * @description
      * This method parses JWS signature string.
      * Resulted associative array has following properties:
      *
      * - headerObj - JSON object of header
      * - payloadObj - JSON object of payload if payload is JSON string otherwise undefined
      * - headerPP - pretty printed JSON header by stringify
      * - payloadPP - pretty printed JSON payload by stringify if payload is JSON otherwise Base64URL decoded raw string of payload
      * - sigHex - hexadecimal string of signature
      *
      * @example
      * KJUR.jws.JWS.parse(sJWS) ->
      * {
      *   headerObj: {"alg": "RS256", "typ": "JWS"},
      *   payloadObj: {"product": "orange", "quantity": 100},
      *   headerPP:
      *   '{
      *     "alg": "RS256",
      *     "typ": "JWS"
      *   }',
      *   payloadPP:
      *   '{
      *     "product": "orange",
      *     "quantity": 100
      *   }',
      *   sigHex: "91f3cd..."
      * }
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.parse")
    @js.native
    def parse(sJWS: String): JWSResult = js.native
    
    /**
      * parse JWS string and set public property 'parsedJWS' dictionary.
      * @param sJWS JWS signature string to be parsed.
      * @throws if sJWS is not comma separated string such like "Header.Payload.Signature".
      * @throws if JWS Header is a malformed JSON string.
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.parseJWS")
    @js.native
    def parseJWS(sJWS: String): Unit = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.parseJWS")
    @js.native
    def parseJWS(sJWS: String, sigValNotNeeded: Boolean): Unit = js.native
    
    /**
      * read a String "s" as JSON object if it is safe.
      * If a String "s" is a malformed JSON string or not JSON string,
      * this returns null, otherwise returns JSON object.
      * @param s JSON string
      * @return JSON object or null
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.readSafeJSONString")
    @js.native
    def readSafeJSONString(s: String): js.Object | Null = js.native
    
    /**
      * generate JWS signature by specified key
      * @param alg JWS algorithm name to sign and force set to sHead or null
      * @param spHead string or object of JWS Header
      * @param spPayload string or object of JWS Payload
      * @param key string of private key or mac key object to sign
      * @param pass (OPTION)passcode to use encrypted asymmetric private key
      * @return JWS signature string
      * @see [jsrsasign KJUR.crypto.Signature method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Signature.html)
      * @see [jsrsasign KJUR.crypto.Mac method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Mac.html)
      * @description
      * This method supports following algorithms.
      *
      * |alg value|spec requirement|jsjws support|
      * |:--------|:---------------|:------------|
      * |HS256|REQUIRED|SUPPORTED|
      * |HS384|OPTIONAL|SUPPORTED|
      * |HS512|OPTIONAL|SUPPORTED|
      * |RS256|RECOMMENDED|SUPPORTED|
      * |RS384|OPTIONAL|SUPPORTED|
      * |RS512|OPTIONAL|SUPPORTED|
      * |ES256|RECOMMENDED+|SUPPORTED|
      * |ES384|OPTIONAL|SUPPORTED|
      * |ES512|OPTIONAL|-|
      * |PS256|OPTIONAL|SUPPORTED|
      * |PS384|OPTIONAL|SUPPORTED|
      * |PS512|OPTIONAL|SUPPORTED|
      * |none|REQUIRED|SUPPORTED(signature generation only)|
      *
      * NOTE1:
      * salt length of RSAPSS signature is the same as the hash algorithm length
      * because of [IETF JOSE ML discussion](http://www.ietf.org/mail-archive/web/jose/current/msg02901.html).
      *
      * NOTE2:
      * To support HS384, patched version of CryptoJS is used.
      * [See here for detail](https://code.google.com/p/crypto-js/issues/detail?id=84).
      *
      * NOTE3:
      * From jsrsasign 4.10.0 jws 3.3.0, Way to provide password
      * for HS* algorithm is changed. The 'key' attribute value is
      * passed to `KJUR.crypto.Mac.setPassword` so please see
      * `KJUR.crypto.Mac.setPassword` for detail.
      * As for backword compatibility, if key is a string, has even length and
      * 0..9, A-F or a-f characters, key string is treated as a hexadecimal
      * otherwise it is treated as a raw string.
      *
      * @example
      * // sign HS256 signature with password "aaa" implicitly handled as string
      * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256", cty: "JWT"}, {age: 21}, "aaa");
      * // sign HS256 signature with password "6161" implicitly handled as hex
      * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256", cty: "JWT"}, {age: 21}, "6161");
      * // sign HS256 signature with base64 password
      * sJWS = KJUR.jws.JWS.sign(null, {alg: "HS256"}, {age: 21}, {b64: "Mi/8..a="});
      * // sign RS256 signature with PKCS#8 PEM RSA private key
      * sJWS = KJUR.jws.JWS.sign(null, {alg: "RS256"}, {age: 21}, "-----BEGIN PRIVATE KEY...");
      * // sign RS256 signature with PKCS#8 PEM ECC private key with passcode
      * sJWS = KJUR.jws.JWS.sign(null, {alg: "ES256"}, {age: 21},
      *                          "-----BEGIN PRIVATE KEY...", "keypass");
      * // header and payload can be passed by both string and object
      * sJWS = KJUR.jws.JWS.sign(null, '{alg:"HS256",cty:"JWT"}', '{age:21}', "aaa");
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: String, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: String, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: js.Object): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: js.Object, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: String, spPayload: js.Object, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: String, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: String, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: js.Object): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: js.Object, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: String, spHead: AlgString, spPayload: js.Object, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: String, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: String, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: js.Object): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: js.Object, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: String, spPayload: js.Object, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: String, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: String, pass: StringDictionary[String]): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: js.Object): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: js.Object, pass: String): String = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.sign")
    @js.native
    def sign(alg: Null, spHead: AlgString, spPayload: js.Object, pass: StringDictionary[String]): String = js.native
    
    /**
      * verify JWS signature by specified key or certificate
      * @param sJWS string of JWS signature to verify
      * @param key string of public key, certificate or key object to verify
      * @param acceptAlgs array of algorithm name strings (OPTION)
      * @return true if the signature is valid otherwise false
      * @see [jsrsasign KJUR.crypto.Signature method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Signature.html)
      * @see [jsrsasign KJUR.crypto.Mac method](https://kjur.github.io/jsrsasign/api/symbols/KJUR.crypto.Mac.html)
      * @description
      * This method verifies a JSON Web Signature Compact Serialization string by the validation
      * algorithm as described in
      * [the section 5 of Internet Draft draft-jones-json-web-signature-04.](http://self-issued.info/docs/draft-jones-json-web-signature-04.html#anchor5)
      *
      * Since 3.2.0 strict key checking has been provided against a JWS algorithm
      * in a JWS header.
      *
      * - In case 'alg' is 'HS*' in the JWS header,
      * 'key' shall be hexadecimal string for Hmac{256,384,512} shared secret key.
      * Otherwise it raise an error.
      * - In case 'alg' is 'RS*' or 'PS*' in the JWS header,
      * 'key' shall be a RSAKey object or a PEM string of
      * X.509 RSA public key certificate or PKCS#8 RSA public key.
      * Otherwise it raise an error.
      * - In case 'alg' is 'ES*' in the JWS header,
      * 'key' shall be a KJUR.crypto.ECDSA object or a PEM string of
      * X.509 ECC public key certificate or PKCS#8 ECC public key.
      * Otherwise it raise an error.
      * - In case 'alg' is 'none' in the JWS header,
      * validation not supported after jsjws 3.1.0.
      *
      *
      *
      * NOTE1: The argument 'acceptAlgs' is supported since 3.2.0.
      * Strongly recommended to provide acceptAlgs to mitigate
      * signature replacement attacks.
      *
      *
      * NOTE2: From jsrsasign 4.9.0 jws 3.2.5, Way to provide password
      * for HS* algorithm is changed. The 'key' attribute value is
      * passed to `KJUR.crypto.Mac.setPassword` so please see
      * `KJUR.crypto.Mac.setPassword` for detail.
      * As for backword compatibility, if key is a string, has even length and
      * 0..9, A-F or a-f characters, key string is treated as a hexadecimal
      * otherwise it is treated as a raw string.
      *
      * @example
      * // 1) verify a RS256 JWS signature by a certificate string.
      * isValid = KJUR.jws.JWS.verify('eyJh...', '-----BEGIN...', ['RS256']);
      *
      * // 2) verify a HS256 JWS signature by a certificate string.
      * isValid = KJUR.jws.JWS.verify('eyJh...', {hex: '6f62ad...'}, ['HS256']);
      * isValid = KJUR.jws.JWS.verify('eyJh...', {b64: 'Mi/ab8...a=='}, ['HS256']);
      * isValid = KJUR.jws.JWS.verify('eyJh...', {utf8: 'Secret秘密'}, ['HS256']);
      * isValid = KJUR.jws.JWS.verify('eyJh...', '6f62ad', ['HS256']); // implicit hex
      * isValid = KJUR.jws.JWS.verify('eyJh...', '6f62ada', ['HS256']); // implicit raw string
      *
      * // 3) verify a ES256 JWS signature by a KJUR.crypto.ECDSA key object.
      * var pubkey = KEYUTIL.getKey('-----BEGIN CERT...');
      * var isValid = KJUR.jws.JWS.verify('eyJh...', pubkey);
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.verify")
    @js.native
    def verify(sJWS: String, key: String): Boolean = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.verify")
    @js.native
    def verify(sJWS: String, key: String, acceptAlgs: js.Array[String]): Boolean = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.verify")
    @js.native
    def verify(sJWS: String, key: String, acceptAlgs: B64): Boolean = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.verify")
    @js.native
    def verify(sJWS: String, key: String, acceptAlgs: Hex): Boolean = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.verify")
    @js.native
    def verify(sJWS: String, key: String, acceptAlgs: Utf8): Boolean = js.native
    
    /**
      * @param sJWT string of JSON Web Token(JWT) to verify
      * @param key string of public key, certificate or key object to verify
      * @param acceptField associative array of acceptable fields (OPTION)
      * @return true if the JWT token is valid otherwise false
      *
      * @description
      * This method verifies a
      * [RFC 7519](https://tools.ietf.org/html/rfc7519)
      * JSON Web Token(JWT).
      * It will verify following:
      *
      * - Header.alg
      *
      * - alg is specified in JWT header.
      * - alg is included in acceptField.alg array. (MANDATORY)
      * - alg is proper for key.
      *
      *
      * - Payload.iss (issuer) - Payload.iss is included in acceptField.iss array if specified. (OPTION)
      * - Payload.sub (subject) - Payload.sub is included in acceptField.sub array if specified. (OPTION)
      * - Payload.aud (audience) - Payload.aud is included in acceptField.aud array or
      *     the same as value if specified. (OPTION)
      * - Time validity
      *
      * -
      * If acceptField.verifyAt as number of UNIX origin time is specifed for validation time,
      * this method will verify at the time for it, otherwise current time will be used to verify.
      *
      * -
      * Clock of JWT generator or verifier can be fast or slow. If these clocks are
      * very different, JWT validation may fail. To avoid such case, 'jsrsasign' supports
      * 'acceptField.gracePeriod' parameter which specifies acceptable time difference
      * of those clocks in seconds. So if you want to accept slow or fast in 2 hours,
      * you can specify <code>acceptField.gracePeriod = 2 * 60 * 60;</code>.
      * "gracePeriod" is zero by default.
      * "gracePeriod" is supported since jsrsasign 5.0.12.
      *
      * - Payload.exp (expire) - Validation time is smaller than Payload.exp + gracePeriod.
      * - Payload.nbf (not before) - Validation time is greater than Payload.nbf - gracePeriod.
      * - Payload.iat (issued at) - Validation time is greater than Payload.iat - gracePeriod.
      *
      *
      * - Payload.jti (JWT id) - Payload.jti is included in acceptField.jti if specified. (OPTION)
      * - JWS signature of JWS is valid for specified key.
      *
      *
      * __acceptField parameters__
      * Here is available acceptField argument parameters:
      *
      * - alg - array of acceptable signature algorithm names (ex. ["HS256", "HS384"])
      * - iss - array of acceptable issuer names (ex. ['http://foo.com'])
      * - sub - array of acceptable subject names (ex. ['mailto:john@foo.com'])
      * - aud - array of acceptable audience name (ex. ['http://foo.com'])
      * - jti - string of acceptable JWT ID (OPTION) (ex. 'id1234')
      * -
      * verifyAt - time to verify 'nbf', 'iat' and 'exp' in UNIX seconds (OPTION) (ex. 1377663900).
      * If this is not specified, current time of verifier will be used.
      * `KJUR.jws.IntDate` may be useful to specify it.
      *
      * - gracePeriod - acceptable time difference between signer and verifier
      * in seconds (ex. 3600). If this is not specified, zero will be used.
      *
      *
      * @example
      * // simple validation for HS256
      * isValid = KJUR.jws.JWS.verifyJWT("eyJhbG...", "616161", {alg: ["HS256"]}),
      *
      * // full validation for RS or PS
      * pubkey = KEYUTIL.getKey('-----BEGIN CERT...');
      * isValid = KJUR.jws.JWS.verifyJWT('eyJh...', pubkey, {
      *   alg: ['RS256', 'RS512', 'PS256', 'PS512'],
      *   iss: ['http://foo.com'],
      *   sub: ['mailto:john@foo.com', 'mailto:alice@foo.com'],
      *   verifyAt: KJUR.jws.IntDate.get('20150520235959Z'),
      *   aud: ['http://foo.com'], // aud: 'http://foo.com' is fine too.
      *   jti: 'id123456',
      *   gracePeriod: 1 * 60 * 60 // accept 1 hour slow or fast
      * });
      */
    @JSImport("jsrsasign", "KJUR.jws.JWS.verifyJWT")
    @js.native
    def verifyJWT(sJWT: String, key: String): Boolean = js.native
    @JSImport("jsrsasign", "KJUR.jws.JWS.verifyJWT")
    @js.native
    def verifyJWT(sJWT: String, key: String, acceptField: Aud): Boolean = js.native
  }
}
