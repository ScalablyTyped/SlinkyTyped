package typingsSlinky.reactSortableTree

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFlatData[T, I /* <: String | Double */, K /* <: /* keyof T */ String */, P /* <: /* keyof T */ String */] extends js.Object {
  var flatData: NumberDictionary[T] | StringDictionary[T] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  var getKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ] = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  var getParentKey: js.UndefOr[
    js.Function1[
      /* item */ T, 
      /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ]
  ] = js.native
  var rootKey: js.UndefOr[I] = js.native
}

object AnonFlatData {
  @scala.inline
  def apply[T, I, K, P](flatData: NumberDictionary[T] | StringDictionary[T]): AnonFlatData[T, I, K, P] = {
    val __obj = js.Dynamic.literal(flatData = flatData.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlatData[T, I, K, P]]
  }
  @scala.inline
  implicit class AnonFlatDataOps[Self[t, i, k, p] <: AnonFlatData[t, i, k, p], T, I, K, P] (val x: Self[T, I, K, P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, I, K, P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, I, K, P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, I, K, P]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, I, K, P]) with Other]
    @scala.inline
    def withFlatData(value: NumberDictionary[T] | StringDictionary[T]): Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ): Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetKey: Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetParentKey(
      value: /* item */ T => /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
    ): Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetParentKey: Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRootKey(value: I): Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootKey: Self[T, I, K, P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootKey")(js.undefined)
        ret
    }
  }
  
}

