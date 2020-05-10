package typingsSlinky.hasha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[EncodingType] extends js.Object {
  /**
  		Values: `md5` `sha1` `sha256` `sha512` _([Platform dependent](https://nodejs.org/api/crypto.html#crypto_crypto_createhash_algorithm_options))_
  		_The `md5` algorithm is good for [file revving](https://github.com/sindresorhus/rev-hash), but you should never use `md5` or `sha1` for anything sensitive. [They're insecure.](http://googleonlinesecurity.blogspot.no/2014/09/gradually-sunsetting-sha-1.html)_
  		@default 'sha512'
  		*/
  val algorithm: js.UndefOr[AlgorithmName] = js.native
  /**
  		Encoding of the returned hash.
  		@default 'hex'
  		*/
  val encoding: js.UndefOr[EncodingType] = js.native
}

object Options {
  @scala.inline
  def apply[EncodingType](): Options[EncodingType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[EncodingType]]
  }
  @scala.inline
  implicit class OptionsOps[Self[encodingtype] <: Options[encodingtype], EncodingType] (val x: Self[EncodingType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[EncodingType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[EncodingType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[EncodingType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[EncodingType] with Other]
    @scala.inline
    def withAlgorithm(value: AlgorithmName): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlgorithm: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: EncodingType): Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self[EncodingType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
  }
  
}

