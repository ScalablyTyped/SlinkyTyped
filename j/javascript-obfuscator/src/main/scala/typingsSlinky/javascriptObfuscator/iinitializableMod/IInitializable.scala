package typingsSlinky.javascriptObfuscator.iinitializableMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInitializable[T /* <: js.Array[_] */]
  extends /* key */ StringDictionary[js.Any] {
  /**
    * @param args
    */
  def initialize(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Unit = js.native
}

object IInitializable {
  @scala.inline
  def apply[T](initialize: T => Unit): IInitializable[T] = {
    val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[IInitializable[T]]
  }
  @scala.inline
  implicit class IInitializableOps[Self[t] <: IInitializable[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withInitialize(value: T => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

