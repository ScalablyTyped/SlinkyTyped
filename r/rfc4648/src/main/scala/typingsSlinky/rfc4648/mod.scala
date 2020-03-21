package typingsSlinky.rfc4648

import typingsSlinky.rfc4648.codecMod.Encoding
import typingsSlinky.rfc4648.codecMod.ParseOptions
import typingsSlinky.rfc4648.codecMod.StringifyOptions
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rfc4648", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object base16 extends js.Object {
    def parse(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  @js.native
  object base32 extends js.Object {
    def parse(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  @js.native
  object base32hex extends js.Object {
    def parse(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  @js.native
  object base64 extends js.Object {
    def parse(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  @js.native
  object base64url extends js.Object {
    def parse(string: String): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double]): String = js.native
    def stringify(data: ArrayLike[Double], opts: StringifyOptions): String = js.native
  }
  
  @js.native
  object codec extends js.Object {
    @JSName("parse")
    var parse_Original: js.Function3[
        /* string */ String, 
        /* encoding */ Encoding, 
        /* opts */ js.UndefOr[ParseOptions], 
        scala.scalajs.js.typedarray.Uint8Array
      ] = js.native
    @JSName("stringify")
    var stringify_Original: js.Function3[
        /* data */ ArrayLike[Double], 
        /* encoding */ Encoding, 
        /* opts */ js.UndefOr[StringifyOptions], 
        String
      ] = js.native
    def parse(string: String, encoding: Encoding): scala.scalajs.js.typedarray.Uint8Array = js.native
    def parse(string: String, encoding: Encoding, opts: ParseOptions): scala.scalajs.js.typedarray.Uint8Array = js.native
    def stringify(data: ArrayLike[Double], encoding: Encoding): String = js.native
    def stringify(data: ArrayLike[Double], encoding: Encoding, opts: StringifyOptions): String = js.native
  }
  
}

