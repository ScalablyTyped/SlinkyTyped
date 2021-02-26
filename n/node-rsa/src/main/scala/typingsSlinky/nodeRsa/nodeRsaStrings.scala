package typingsSlinky.nodeRsa

import typingsSlinky.nodeRsa.mod.Encoding
import typingsSlinky.nodeRsa.mod.EncryptionScheme
import typingsSlinky.nodeRsa.mod.Format
import typingsSlinky.nodeRsa.mod.FormatComponentsPrivate
import typingsSlinky.nodeRsa.mod.FormatComponentsPublic
import typingsSlinky.nodeRsa.mod.FormatDer
import typingsSlinky.nodeRsa.mod.FormatPem
import typingsSlinky.nodeRsa.mod.HashingAlgorithm
import typingsSlinky.nodeRsa.mod.SigningScheme
import typingsSlinky.nodeRsa.mod.SigningSchemeHash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeRsaStrings {
  
  @js.native
  sealed trait ascii extends Encoding
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base64 extends Encoding
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait binary extends Encoding
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  
  @js.native
  sealed trait browser extends StObject
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait buffer extends Encoding
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait components
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def components: components = "components".asInstanceOf[components]
  
  @js.native
  sealed trait `components-der`
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def `components-der`: `components-der` = "components-der".asInstanceOf[`components-der`]
  
  @js.native
  sealed trait `components-pem`
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def `components-pem`: `components-pem` = "components-pem".asInstanceOf[`components-pem`]
  
  @js.native
  sealed trait `components-private`
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def `components-private`: `components-private` = "components-private".asInstanceOf[`components-private`]
  
  @js.native
  sealed trait `components-private-der`
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def `components-private-der`: `components-private-der` = "components-private-der".asInstanceOf[`components-private-der`]
  
  @js.native
  sealed trait `components-private-pem`
    extends Format
       with FormatComponentsPrivate
  @scala.inline
  def `components-private-pem`: `components-private-pem` = "components-private-pem".asInstanceOf[`components-private-pem`]
  
  @js.native
  sealed trait `components-public`
    extends Format
       with FormatComponentsPublic
  @scala.inline
  def `components-public`: `components-public` = "components-public".asInstanceOf[`components-public`]
  
  @js.native
  sealed trait `components-public-der`
    extends Format
       with FormatComponentsPublic
  @scala.inline
  def `components-public-der`: `components-public-der` = "components-public-der".asInstanceOf[`components-public-der`]
  
  @js.native
  sealed trait `components-public-pem`
    extends Format
       with FormatComponentsPublic
  @scala.inline
  def `components-public-pem`: `components-public-pem` = "components-public-pem".asInstanceOf[`components-public-pem`]
  
  @js.native
  sealed trait hex extends Encoding
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait json extends StObject
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait latin1 extends Encoding
  @scala.inline
  def latin1: latin1 = "latin1".asInstanceOf[latin1]
  
  @js.native
  sealed trait md4 extends HashingAlgorithm
  @scala.inline
  def md4: md4 = "md4".asInstanceOf[md4]
  
  @js.native
  sealed trait md5 extends HashingAlgorithm
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  
  @js.native
  sealed trait node extends StObject
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @js.native
  sealed trait pkcs1
    extends EncryptionScheme
       with Format
       with FormatPem
       with SigningScheme
  @scala.inline
  def pkcs1: pkcs1 = "pkcs1".asInstanceOf[pkcs1]
  
  @js.native
  sealed trait `pkcs1-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs1-der`: `pkcs1-der` = "pkcs1-der".asInstanceOf[`pkcs1-der`]
  
  @js.native
  sealed trait `pkcs1-md4` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-md4`: `pkcs1-md4` = "pkcs1-md4".asInstanceOf[`pkcs1-md4`]
  
  @js.native
  sealed trait `pkcs1-md5` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-md5`: `pkcs1-md5` = "pkcs1-md5".asInstanceOf[`pkcs1-md5`]
  
  @js.native
  sealed trait `pkcs1-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs1-pem`: `pkcs1-pem` = "pkcs1-pem".asInstanceOf[`pkcs1-pem`]
  
  @js.native
  sealed trait `pkcs1-private`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs1-private`: `pkcs1-private` = "pkcs1-private".asInstanceOf[`pkcs1-private`]
  
  @js.native
  sealed trait `pkcs1-private-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs1-private-der`: `pkcs1-private-der` = "pkcs1-private-der".asInstanceOf[`pkcs1-private-der`]
  
  @js.native
  sealed trait `pkcs1-private-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs1-private-pem`: `pkcs1-private-pem` = "pkcs1-private-pem".asInstanceOf[`pkcs1-private-pem`]
  
  @js.native
  sealed trait `pkcs1-public`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs1-public`: `pkcs1-public` = "pkcs1-public".asInstanceOf[`pkcs1-public`]
  
  @js.native
  sealed trait `pkcs1-public-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs1-public-der`: `pkcs1-public-der` = "pkcs1-public-der".asInstanceOf[`pkcs1-public-der`]
  
  @js.native
  sealed trait `pkcs1-public-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs1-public-pem`: `pkcs1-public-pem` = "pkcs1-public-pem".asInstanceOf[`pkcs1-public-pem`]
  
  @js.native
  sealed trait `pkcs1-ripemd160` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-ripemd160`: `pkcs1-ripemd160` = "pkcs1-ripemd160".asInstanceOf[`pkcs1-ripemd160`]
  
  @js.native
  sealed trait `pkcs1-sha` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha`: `pkcs1-sha` = "pkcs1-sha".asInstanceOf[`pkcs1-sha`]
  
  @js.native
  sealed trait `pkcs1-sha1` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha1`: `pkcs1-sha1` = "pkcs1-sha1".asInstanceOf[`pkcs1-sha1`]
  
  @js.native
  sealed trait `pkcs1-sha224` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha224`: `pkcs1-sha224` = "pkcs1-sha224".asInstanceOf[`pkcs1-sha224`]
  
  @js.native
  sealed trait `pkcs1-sha256` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha256`: `pkcs1-sha256` = "pkcs1-sha256".asInstanceOf[`pkcs1-sha256`]
  
  @js.native
  sealed trait `pkcs1-sha384` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha384`: `pkcs1-sha384` = "pkcs1-sha384".asInstanceOf[`pkcs1-sha384`]
  
  @js.native
  sealed trait `pkcs1-sha512` extends SigningSchemeHash
  @scala.inline
  def `pkcs1-sha512`: `pkcs1-sha512` = "pkcs1-sha512".asInstanceOf[`pkcs1-sha512`]
  
  @js.native
  sealed trait pkcs1_oaep extends EncryptionScheme
  @scala.inline
  def pkcs1_oaep: pkcs1_oaep = "pkcs1_oaep".asInstanceOf[pkcs1_oaep]
  
  @js.native
  sealed trait pkcs8
    extends Format
       with FormatPem
  @scala.inline
  def pkcs8: pkcs8 = "pkcs8".asInstanceOf[pkcs8]
  
  @js.native
  sealed trait `pkcs8-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs8-der`: `pkcs8-der` = "pkcs8-der".asInstanceOf[`pkcs8-der`]
  
  @js.native
  sealed trait `pkcs8-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs8-pem`: `pkcs8-pem` = "pkcs8-pem".asInstanceOf[`pkcs8-pem`]
  
  @js.native
  sealed trait `pkcs8-private`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs8-private`: `pkcs8-private` = "pkcs8-private".asInstanceOf[`pkcs8-private`]
  
  @js.native
  sealed trait `pkcs8-private-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs8-private-der`: `pkcs8-private-der` = "pkcs8-private-der".asInstanceOf[`pkcs8-private-der`]
  
  @js.native
  sealed trait `pkcs8-private-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs8-private-pem`: `pkcs8-private-pem` = "pkcs8-private-pem".asInstanceOf[`pkcs8-private-pem`]
  
  @js.native
  sealed trait `pkcs8-public`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs8-public`: `pkcs8-public` = "pkcs8-public".asInstanceOf[`pkcs8-public`]
  
  @js.native
  sealed trait `pkcs8-public-der`
    extends Format
       with FormatDer
  @scala.inline
  def `pkcs8-public-der`: `pkcs8-public-der` = "pkcs8-public-der".asInstanceOf[`pkcs8-public-der`]
  
  @js.native
  sealed trait `pkcs8-public-pem`
    extends Format
       with FormatPem
  @scala.inline
  def `pkcs8-public-pem`: `pkcs8-public-pem` = "pkcs8-public-pem".asInstanceOf[`pkcs8-public-pem`]
  
  @js.native
  sealed trait `private`
    extends Format
       with FormatPem
  @scala.inline
  def `private`: `private` = "private".asInstanceOf[`private`]
  
  @js.native
  sealed trait pss extends SigningScheme
  @scala.inline
  def pss: pss = "pss".asInstanceOf[pss]
  
  @js.native
  sealed trait `pss-md4` extends SigningSchemeHash
  @scala.inline
  def `pss-md4`: `pss-md4` = "pss-md4".asInstanceOf[`pss-md4`]
  
  @js.native
  sealed trait `pss-md5` extends SigningSchemeHash
  @scala.inline
  def `pss-md5`: `pss-md5` = "pss-md5".asInstanceOf[`pss-md5`]
  
  @js.native
  sealed trait `pss-ripemd160` extends SigningSchemeHash
  @scala.inline
  def `pss-ripemd160`: `pss-ripemd160` = "pss-ripemd160".asInstanceOf[`pss-ripemd160`]
  
  @js.native
  sealed trait `pss-sha` extends SigningSchemeHash
  @scala.inline
  def `pss-sha`: `pss-sha` = "pss-sha".asInstanceOf[`pss-sha`]
  
  @js.native
  sealed trait `pss-sha1` extends SigningSchemeHash
  @scala.inline
  def `pss-sha1`: `pss-sha1` = "pss-sha1".asInstanceOf[`pss-sha1`]
  
  @js.native
  sealed trait `pss-sha224` extends SigningSchemeHash
  @scala.inline
  def `pss-sha224`: `pss-sha224` = "pss-sha224".asInstanceOf[`pss-sha224`]
  
  @js.native
  sealed trait `pss-sha256` extends SigningSchemeHash
  @scala.inline
  def `pss-sha256`: `pss-sha256` = "pss-sha256".asInstanceOf[`pss-sha256`]
  
  @js.native
  sealed trait `pss-sha384` extends SigningSchemeHash
  @scala.inline
  def `pss-sha384`: `pss-sha384` = "pss-sha384".asInstanceOf[`pss-sha384`]
  
  @js.native
  sealed trait `pss-sha512` extends SigningSchemeHash
  @scala.inline
  def `pss-sha512`: `pss-sha512` = "pss-sha512".asInstanceOf[`pss-sha512`]
  
  @js.native
  sealed trait public
    extends Format
       with FormatPem
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @js.native
  sealed trait ripemd160 extends HashingAlgorithm
  @scala.inline
  def ripemd160: ripemd160 = "ripemd160".asInstanceOf[ripemd160]
  
  @js.native
  sealed trait sha1 extends HashingAlgorithm
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha224 extends HashingAlgorithm
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  
  @js.native
  sealed trait sha256 extends HashingAlgorithm
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha384 extends HashingAlgorithm
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  
  @js.native
  sealed trait sha512 extends HashingAlgorithm
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait ucs2 extends Encoding
  @scala.inline
  def ucs2: ucs2 = "ucs2".asInstanceOf[ucs2]
  
  @js.native
  sealed trait utf16le extends Encoding
  @scala.inline
  def utf16le: utf16le = "utf16le".asInstanceOf[utf16le]
  
  @js.native
  sealed trait utf8 extends Encoding
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}
