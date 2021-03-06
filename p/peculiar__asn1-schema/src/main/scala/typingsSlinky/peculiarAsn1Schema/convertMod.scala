package typingsSlinky.peculiarAsn1Schema

import typingsSlinky.peculiarAsn1Schema.typesMod.IEmptyConstructor
import typingsSlinky.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/convert", JSImport.Namespace)
@js.native
object convertMod extends js.Object {
  @js.native
  class AsnConvert () extends js.Object
  
  /* static members */
  @js.native
  object AsnConvert extends js.Object {
    def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = js.native
    def serialize(obj: js.Any): js.typedarray.ArrayBuffer = js.native
  }
  
}

