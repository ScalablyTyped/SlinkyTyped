package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jasmine.jasmineStrings.ObjectContaining
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectContaining_[T]
  extends AsymmetricMatcher[js.Any]
     with _Expected[T] {
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ ObjectContaining with TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ ObjectContaining with TopLevel[js.Any]
    ]
  ] = js.native
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
}

object ObjectContaining_ {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean
  ): ObjectContaining_[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    __obj.asInstanceOf[ObjectContaining_[T]]
  }
  @scala.inline
  implicit class ObjectContaining_Ops[Self[t] <: ObjectContaining_[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withJasmineMatches(value: (js.Any, js.Array[_], js.Array[_]) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jasmineMatches")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNew(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ /* sample */ ObjectContaining with TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ ObjectContaining with TopLevel[js.Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNew: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.undefined)
        ret
    }
  }
  
}

