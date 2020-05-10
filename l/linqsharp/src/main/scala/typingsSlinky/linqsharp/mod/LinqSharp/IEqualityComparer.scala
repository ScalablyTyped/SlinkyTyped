package typingsSlinky.linqsharp.mod.LinqSharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEqualityComparer[T] extends js.Object {
  def Equals(x: T, y: T): Boolean = js.native
  def GetHashCode(obj: T): Double = js.native
}

object IEqualityComparer {
  @scala.inline
  def apply[T](Equals: (T, T) => Boolean, GetHashCode: T => Double): IEqualityComparer[T] = {
    val __obj = js.Dynamic.literal(Equals = js.Any.fromFunction2(Equals), GetHashCode = js.Any.fromFunction1(GetHashCode))
    __obj.asInstanceOf[IEqualityComparer[T]]
  }
  @scala.inline
  implicit class IEqualityComparerOps[Self[t] <: IEqualityComparer[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withEquals(value: (T, T) => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Equals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetHashCode(value: T => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetHashCode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

