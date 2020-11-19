package typingsSlinky.passportLocalMongoose.mod

import org.scalajs.dom.raw.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", "model")
@js.native
object model extends js.Object {
  
  def apply[T /* <: Document */](name: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: js.UndefOr[scala.Nothing],
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: js.UndefOr[scala.Nothing], collection: String, skipInit: Boolean): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](
    name: String,
    schema: PassportLocalSchema,
    collection: js.UndefOr[scala.Nothing],
    skipInit: Boolean
  ): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String): PassportLocalModel[T] = js.native
  def apply[T /* <: Document */](name: String, schema: PassportLocalSchema, collection: String, skipInit: Boolean): PassportLocalModel[T] = js.native
}
