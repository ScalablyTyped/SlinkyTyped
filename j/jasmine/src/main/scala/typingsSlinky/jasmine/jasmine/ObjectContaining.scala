package typingsSlinky.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.jasmine.jasmine.ExpectedRecursive because Already inherited
- typingsSlinky.jasmine.jasmine.Expected because Already inherited */ @js.native
trait ObjectContaining[T]
  extends AsymmetricMatcher[js.Any] {
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typingsSlinky.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typingsSlinky.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
    ]
  ] = js.native
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
}

object ObjectContaining {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
  @scala.inline
  implicit class ObjectContainingOps[Self[t] <: ObjectContaining[t], T] (val x: Self[T]) extends AnyVal {
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
      */ /* sample */ typingsSlinky.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ typingsSlinky.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
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

