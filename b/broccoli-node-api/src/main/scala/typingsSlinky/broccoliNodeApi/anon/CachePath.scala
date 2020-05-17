package typingsSlinky.broccoliNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CachePath extends js.Object {
  var cachePath: js.UndefOr[String] = js.native
  var inputPaths: js.Array[String] = js.native
  var outputPath: String = js.native
}

object CachePath {
  @scala.inline
  def apply(inputPaths: js.Array[String], outputPath: String): CachePath = {
    val __obj = js.Dynamic.literal(inputPaths = inputPaths.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachePath]
  }
  @scala.inline
  implicit class CachePathOps[Self <: CachePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputPaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCachePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCachePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cachePath")(js.undefined)
        ret
    }
  }
  
}

