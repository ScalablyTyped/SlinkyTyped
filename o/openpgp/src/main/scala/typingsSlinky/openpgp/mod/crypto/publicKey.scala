package typingsSlinky.openpgp.mod.crypto

import typingsSlinky.openpgp.anon.C
import typingsSlinky.openpgp.anon.S
import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.`type`.mpi.MPI
import typingsSlinky.openpgp.mod.`type`.oid.OID
import typingsSlinky.openpgp.mod.crypto.publicKey.elliptic.curve.Curve
import typingsSlinky.openpgp.mod.enums.symmetric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "crypto.public_key")
@js.native
object publicKey extends js.Object {
  
  @js.native
  object dsa extends js.Object {
    
    /**
      * DSA Sign function
      * @param hash_algo
      * @param hashed
      * @param g
      * @param p
      * @param q
      * @param x
      * @returns
      */
    def sign(
      hash_algo: Integer,
      hashed: js.typedarray.Uint8Array,
      g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Object = js.native
    
    /**
      * DSA Verify function
      * @param hash_algo
      * @param r
      * @param s
      * @param hashed
      * @param g
      * @param p
      * @param q
      * @param y
      * @returns BN
      */
    def verify(
      hash_algo: Integer,
      r: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      hashed: js.typedarray.Uint8Array,
      g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
  }
  
  @js.native
  object elgamal extends js.Object {
    
    /**
      * ElGamal Encryption function
      * @param c1
      * @param c2
      * @param p
      * @param x
      * @returns BN
      */
    def decrypt(
      c1: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    
    /**
      * ElGamal Encryption function
      * @param m
      * @param p
      * @param g
      * @param y
      * @returns
      */
    def encrypt(
      m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      g: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Object = js.native
  }
  
  /**
    * @see module:crypto/public_key/elliptic/curve
    * @see module:crypto/public_key/elliptic/ecdh
    * @see module:crypto/public_key/elliptic/ecdsa
    * @see module:crypto/public_key/elliptic/eddsa
    */
  @js.native
  object elliptic extends js.Object {
    
    @js.native
    object curve extends js.Object {
      
      @js.native
      class Curve () extends js.Object
    }
    
    @js.native
    object ecdh extends js.Object {
      
      /**
        * Decrypt and unwrap the value derived from session key
        * @param oid Elliptic curve object identifier
        * @param cipher_algo Symmetric cipher to use
        * @param hash_algo Hash algorithm to use
        * @param V Public part of ephemeral key
        * @param C Encrypted and wrapped value derived from session key
        * @param d Recipient private key
        * @param fingerprint Recipient fingerprint
        * @returns Value derived from session
        */
      def decrypt(
        oid: OID,
        cipher_algo: symmetric,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        V: js.typedarray.Uint8Array,
        C: js.typedarray.Uint8Array,
        d: js.typedarray.Uint8Array,
        fingerprint: String
      ): js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
          ] = js.native
      
      /**
        * Encrypt and wrap a session key
        * @param oid Elliptic curve object identifier
        * @param cipher_algo Symmetric cipher to use
        * @param hash_algo Hash algorithm to use
        * @param m Value derived from session key (RFC 6637)
        * @param Q Recipient public key
        * @param fingerprint Recipient fingerprint
        * @returns Returns public part of ephemeral key and encoded session key
        */
      def encrypt(
        oid: OID,
        cipher_algo: symmetric,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        m: MPI,
        Q: js.typedarray.Uint8Array,
        fingerprint: String
      ): js.Promise[C] = js.native
      
      /**
        * Generate ECDHE secret from private key and public part of ephemeral key
        * @param curve Elliptic curve object
        * @param V Public part of ephemeral key
        * @param d Recipient private key
        * @returns Generated ephemeral secret
        */
      def genPrivateEphemeralKey(curve: Curve, V: js.typedarray.Uint8Array, d: js.typedarray.Uint8Array): js.Promise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ _
          ] = js.native
      
      /**
        * Generate ECDHE ephemeral key and secret from public key
        * @param curve Elliptic curve object
        * @param Q Recipient public key
        * @returns Returns public part of ephemeral key and generated ephemeral secret
        */
      def genPublicEphemeralKey(curve: Curve, Q: js.typedarray.Uint8Array): js.Promise[S] = js.native
    }
    
    @js.native
    object ecdsa extends js.Object {
      
      /**
        * Sign a message using the provided key
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used to sign
        * @param m Message to sign
        * @param d Private key used to sign the message
        * @param hashed The hashed message
        * @returns Signature of the message
        */
      def sign(
        oid: OID,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        m: js.typedarray.Uint8Array,
        d: js.typedarray.Uint8Array,
        hashed: js.typedarray.Uint8Array
      ): js.Object = js.native
      
      /**
        * Verifies if a signature is valid for a message
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used in the signature
        * @param signature Signature to verify
        * @param m Message to verify
        * @param Q Public key used to verify the message
        * @param hashed The hashed message
        * @returns
        */
      def verify(
        oid: OID,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        signature: js.Object,
        m: js.typedarray.Uint8Array,
        Q: js.typedarray.Uint8Array,
        hashed: js.typedarray.Uint8Array
      ): Boolean = js.native
    }
    
    @js.native
    object eddsa extends js.Object {
      
      /**
        * Sign a message using the provided keygit
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used to sign
        * @param m Message to sign
        * @param d Private key used to sign
        * @param hashed The hashed message
        * @returns Signature of the message
        */
      def sign(
        oid: OID,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        m: js.typedarray.Uint8Array,
        d: js.typedarray.Uint8Array,
        hashed: js.typedarray.Uint8Array
      ): js.Object = js.native
      
      /**
        * Verifies if a signature is valid for a message
        * @param oid Elliptic curve object identifier
        * @param hash_algo Hash algorithm used in the signature
        * @param signature Signature to verify the message
        * @param m Message to verify
        * @param Q Public key used to verify the message
        * @param hashed The hashed message
        * @returns
        */
      def verify(
        oid: OID,
        hash_algo: typingsSlinky.openpgp.mod.enums.hash,
        signature: js.Object,
        m: js.typedarray.Uint8Array,
        Q: js.typedarray.Uint8Array,
        hashed: js.typedarray.Uint8Array
      ): Boolean = js.native
    }
    
    @js.native
    object key extends js.Object {
      
      @js.native
      class KeyPair () extends js.Object
    }
  }
  
  @js.native
  object prime extends js.Object {
    
    /**
      * Tests whether n is probably prime or not using Fermat's test with b = 2.
      * Fails if b^(n-1) mod n === 1.
      * @param n Number to test
      * @param b Optional Fermat test base
      * @returns
      */
    def fermat(
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      b: Integer
    ): Boolean = js.native
    
    /**
      * Probabilistic primality testing
      * @param n Number to test
      * @param e Optional RSA exponent to check against the prime
      * @param k Optional number of iterations of Miller-Rabin test
      * @returns
      */
    def isProbablePrime(
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer
    ): Boolean = js.native
    
    /**
      * Tests whether n is probably prime or not using the Miller-Rabin test.
      * See HAC Remark 4.28.
      * @param n Number to test
      * @param k Optional number of iterations of Miller-Rabin test
      * @param rand Optional function to generate potential witnesses
      * @returns
      */
    def millerRabin(
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer,
      rand: js.Function
    ): Boolean = js.native
    
    /**
      * Probabilistic random number generator
      * @param bits Bit length of the prime
      * @param e Optional RSA exponent to check against the prime
      * @param k Optional number of iterations of Miller-Rabin test
      * @returns BN
      */
    def randomProbablePrime(
      bits: Integer,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      k: Integer
    ): js.Any = js.native
  }
  
  @js.native
  object rsa extends js.Object {
    
    /**
      * Decrypt RSA message
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @param d RSA private exponent
      * @param p RSA private prime p
      * @param q RSA private prime q
      * @param u RSA private inverse of prime q
      * @returns RSA Plaintext
      */
    def decrypt(
      m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      q: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      u: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    
    /**
      * Encrypt message
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @returns RSA Ciphertext
      */
    def encrypt(
      m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    
    /**
      * Generate a new random private key B bits long with public exponent E.
      * When possible, webCrypto is used. Otherwise, primes are generated using
      * 40 rounds of the Miller-Rabin probabilistic random prime generation algorithm.
      * @see module:crypto/public_key/prime
      * @param B RSA bit length
      * @param E RSA public exponent in hex string
      * @returns RSA public modulus, RSA public exponent, RSA private exponent,
      *          RSA private prime p, RSA private prime q, u = q ** -1 mod p
      */
    def generate(B: Integer, E: String): js.Object = js.native
    
    /**
      * Create signature
      * @param m message
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @param d RSA private exponent
      * @returns RSA Signature
      */
    def sign(
      m: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
    
    /**
      * Verify signature
      * @param s signature
      * @param n RSA public modulus
      * @param e RSA public exponent
      * @returns
      */
    def verify(
      s: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
      e: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
    ): js.Any = js.native
  }
}
