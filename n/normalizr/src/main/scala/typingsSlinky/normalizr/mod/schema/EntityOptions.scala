package typingsSlinky.normalizr.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityOptions[T] extends js.Object {
  var idAttribute: js.UndefOr[String | SchemaFunction] = js.native
  var mergeStrategy: js.UndefOr[MergeFunction] = js.native
  var processStrategy: js.UndefOr[StrategyFunction[T]] = js.native
}

object EntityOptions {
  @scala.inline
  def apply[T](): EntityOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityOptions[T]]
  }
  @scala.inline
  implicit class EntityOptionsOps[Self[t] <: EntityOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withIdAttributeFunction3(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIdAttribute(value: String | SchemaFunction): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdAttribute: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withMergeStrategy(value: (/* entityA */ js.Any, /* entityB */ js.Any) => js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMergeStrategy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withProcessStrategy(value: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStrategy")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutProcessStrategy: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processStrategy")(js.undefined)
        ret
    }
  }
  
}

