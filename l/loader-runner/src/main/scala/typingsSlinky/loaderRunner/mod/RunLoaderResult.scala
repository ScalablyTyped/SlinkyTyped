package typingsSlinky.loaderRunner.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunLoaderResult extends js.Object {
  var cacheable: Boolean = js.native
  var contextDependencies: js.Array[String] = js.native
  var fileDependencies: js.Array[String] = js.native
  var resourceBuffer: js.UndefOr[Buffer | Null] = js.native
  var result: js.UndefOr[js.Array[Buffer | Null]] = js.native
}

object RunLoaderResult {
  @scala.inline
  def apply(cacheable: Boolean, contextDependencies: js.Array[String], fileDependencies: js.Array[String]): RunLoaderResult = {
    val __obj = js.Dynamic.literal(cacheable = cacheable.asInstanceOf[js.Any], contextDependencies = contextDependencies.asInstanceOf[js.Any], fileDependencies = fileDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunLoaderResult]
  }
  @scala.inline
  implicit class RunLoaderResultOps[Self <: RunLoaderResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileDependencies(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileDependencies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceBuffer(value: Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceBuffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceBuffer")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceBufferNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceBuffer")(null)
        ret
    }
    @scala.inline
    def withResult(value: js.Array[Buffer | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(js.undefined)
        ret
    }
  }
  
}

