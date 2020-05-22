package typingsSlinky.formik.fieldArrayMod

import typingsSlinky.formik.typesMod.FormikProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined formik.formik/dist/FieldArray.ArrayHelpers & {  form  :formik.formik/dist/types.FormikProps<any>,   name  :string} */
trait FieldArrayRenderProps extends js.Object {
  var form: FormikProps[_]
  var name: String
  def handleInsert(index: Double, value: js.Any): js.Function0[Unit]
  def handleMove(from: Double, to: Double): js.Function0[Unit]
  def handlePop(): js.Function0[Unit]
  def handlePush(obj: js.Any): js.Function0[Unit]
  def handleRemove(index: Double): js.Function0[Unit]
  def handleReplace(index: Double, value: js.Any): js.Function0[Unit]
  def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit]
  def handleUnshift(value: js.Any): js.Function0[Unit]
  def insert(index: Double, value: js.Any): Unit
  def move(from: Double, to: Double): Unit
  def pop[T](): js.UndefOr[T]
  def push(obj: js.Any): Unit
  def remove[T](index: Double): js.UndefOr[T]
  def replace(index: Double, value: js.Any): Unit
  def swap(indexA: Double, indexB: Double): Unit
  def unshift(value: js.Any): Double
}

object FieldArrayRenderProps {
  @scala.inline
  def apply(
    form: FormikProps[_],
    handleInsert: (Double, js.Any) => js.Function0[Unit],
    handleMove: (Double, Double) => js.Function0[Unit],
    handlePop: () => js.Function0[Unit],
    handlePush: js.Any => js.Function0[Unit],
    handleRemove: Double => js.Function0[Unit],
    handleReplace: (Double, js.Any) => js.Function0[Unit],
    handleSwap: (Double, Double) => js.Function0[Unit],
    handleUnshift: js.Any => js.Function0[Unit],
    insert: (Double, js.Any) => Unit,
    move: (Double, Double) => Unit,
    name: String,
    pop: () => js.UndefOr[js.Any],
    push: js.Any => Unit,
    remove: Double => js.UndefOr[js.Any],
    replace: (Double, js.Any) => Unit,
    swap: (Double, Double) => Unit,
    unshift: js.Any => Double
  ): FieldArrayRenderProps = {
    val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = js.Any.fromFunction0(handlePop), handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2(insert), move = js.Any.fromFunction2(move), name = name.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), swap = js.Any.fromFunction2(swap), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[FieldArrayRenderProps]
  }
}

