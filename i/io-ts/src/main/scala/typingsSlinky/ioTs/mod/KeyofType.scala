package typingsSlinky.ioTs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "KeyofType")
@js.native
class KeyofType[D /* <: StringDictionary[js.Any] */] protected ()
  extends Type_[/* keyof D */ String, /* keyof D */ String, js.Any] {
  def this(
    name: String,
    is: Is[/* keyof D */ String],
    validate: Validate[_, /* keyof D */ String],
    encode: Encode[/* keyof D */ String, /* keyof D */ String],
    keys: D
  ) = this()
  val _tag: typingsSlinky.ioTs.ioTsStrings.KeyofType = js.native
  val keys: D = js.native
}

