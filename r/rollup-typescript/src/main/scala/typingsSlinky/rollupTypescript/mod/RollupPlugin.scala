package typingsSlinky.rollupTypescript.mod

import typingsSlinky.rollupTypescript.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollupPlugin extends js.Object {
  def load(id: String): String = js.native
  def resolveId(importee: String, importer: String): js.Any = js.native
  def transform(code: String, id: String): AnonCode = js.native
}

object RollupPlugin {
  @scala.inline
  def apply(
    load: String => String,
    resolveId: (String, String) => js.Any,
    transform: (String, String) => AnonCode
  ): RollupPlugin = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load), resolveId = js.Any.fromFunction2(resolveId), transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[RollupPlugin]
  }
  @scala.inline
  implicit class RollupPluginOps[Self <: RollupPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoad(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveId(value: (String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTransform(value: (String, String) => AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

