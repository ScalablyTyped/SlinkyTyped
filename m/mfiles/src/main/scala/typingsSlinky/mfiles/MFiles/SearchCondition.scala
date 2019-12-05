package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IExpression
import typingsSlinky.mfiles.ISearchCondition
import typingsSlinky.mfiles.ITypedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchCondition")
@js.native
class SearchCondition () extends ISearchCondition {
  /* CompleteClass */
  override var ConditionType: MFConditionType = js.native
  /* CompleteClass */
  override var Expression: IExpression = js.native
  /* CompleteClass */
  override var TypedValue: ITypedValue = js.native
  /* CompleteClass */
  override def Clone(): ISearchCondition = js.native
  /* CompleteClass */
  override def Set(Expression: IExpression, ConditionType: MFConditionType, TypedValue: ITypedValue): Unit = js.native
}

@JSGlobal("MFiles.SearchCondition")
@js.native
object SearchCondition extends Instantiable0[ISearchCondition]

