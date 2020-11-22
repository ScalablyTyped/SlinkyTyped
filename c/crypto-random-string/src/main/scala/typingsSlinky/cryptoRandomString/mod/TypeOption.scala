package typingsSlinky.cryptoRandomString.mod

import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.`ascii-printable`
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.`url-safe`
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.alphanumeric
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.base64
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.distinguishable
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.hex
import typingsSlinky.cryptoRandomString.cryptoRandomStringStrings.numeric
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOption extends js.Object {
  
  /**
  	Use only characters from a predefined set of allowed characters.
  	Cannot be set at the same time as the `characters` option.
  	@default 'hex'
  	The `distinguishable` set contains only uppercase characters that are not easily confused: `CDEHKMPRTUWXY012458`. It can be useful if you need to print out a short string that you'd like users to read and type back in with minimal errors. For example, reading a code off of a screen that needs to be typed into a phone to connect two devices.
  	The `ascii-printable` set contains all [printable ASCII characters](https://en.wikipedia.org/wiki/ASCII#ASCII_printable_characters): ``!"#$%&\'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~`` Useful for generating passwords where all possible ASCII characters should be used.
  	The `alphanumeric` set contains uppercase letters, lowercase letters, and digits: `ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789`. Useful for generating [nonce](https://developer.mozilla.org/en-US/docs/Web/API/HTMLOrForeignElement/nonce) values.
  	@example
  	```
  	cryptoRandomString({length: 10});
  	//=> '87fc70e2b9'
  	cryptoRandomString({length: 10, type: 'base64'});
  	//=> 'mhsX7xmIv/'
  	cryptoRandomString({length: 10, type: 'url-safe'});
  	//=> 'VEjfNW3Yej'
  	cryptoRandomString({length: 10, type: 'numeric'});
  	//=> '8314659141'
  	cryptoRandomString({length: 6, type: 'distinguishable'});
  	//=> 'CDEHKM'
  	cryptoRandomString({length: 10, type: 'ascii-printable'});
  	//=> '`#Rt8$IK>B'
  	
  	cryptoRandomString({length: 10, type: 'alphanumeric'});
  	//=> 'DMuKL8YtE7'
  	```
  	*/
  var `type`: js.UndefOr[
    hex | base64 | `url-safe` | numeric | distinguishable | `ascii-printable` | alphanumeric
  ] = js.native
}
object TypeOption {
  
  @scala.inline
  def apply(): TypeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeOption]
  }
  
  @scala.inline
  implicit class TypeOptionOps[Self <: TypeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: hex | base64 | `url-safe` | numeric | distinguishable | `ascii-printable` | alphanumeric): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
