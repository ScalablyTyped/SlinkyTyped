package typingsSlinky.immutable.global.Immutable

import typingsSlinky.immutable.Immutable.Record.Factory
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Immutable.Record")
@js.native
object Record extends js.Object {
  def apply[TProps](defaultValues: TProps): Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
  def getDescriptiveName(record: typingsSlinky.immutable.Immutable.Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  @js.native
  object Factory extends js.Object {
    def apply[TProps /* <: js.Object */](): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: js.Iterable[js.Tuple2[String, _]]): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): typingsSlinky.immutable.Immutable.Record[TProps] with TProps = js.native
  }
  
}

