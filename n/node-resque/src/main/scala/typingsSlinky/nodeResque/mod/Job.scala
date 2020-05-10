package typingsSlinky.nodeResque.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job[TResult] extends js.Object {
  var pluginOptions: js.UndefOr[StringDictionary[js.Any]] = js.native
  var plugins: js.UndefOr[js.Array[String]] = js.native
  def perform(args: js.Any*): js.Promise[TResult] = js.native
}

object Job {
  @scala.inline
  def apply[TResult](perform: /* repeated */ js.Any => js.Promise[TResult]): Job[TResult] = {
    val __obj = js.Dynamic.literal(perform = js.Any.fromFunction1(perform))
    __obj.asInstanceOf[Job[TResult]]
  }
  @scala.inline
  implicit class JobOps[Self[tresult] <: Job[tresult], TResult] (val x: Self[TResult]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TResult] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TResult]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TResult] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TResult] with Other]
    @scala.inline
    def withPerform(value: /* repeated */ js.Any => js.Promise[TResult]): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPluginOptions(value: StringDictionary[js.Any]): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginOptions: Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: js.Array[String]): Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self[TResult] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
  }
  
}

