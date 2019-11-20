package typingsSlinky.expoDashFileDashSystem.buildFileSystemDotTypesMod

import typingsSlinky.expoDashFileDashSystem.expoDashFileDashSystemNumbers.`false`
import typingsSlinky.expoDashFileDashSystem.expoDashFileDashSystemNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  var exists: js.UndefOr[`true` with `false`] = js.undefined
  var isDirectory: js.UndefOr[Boolean with `false`] = js.undefined
  var md5: js.UndefOr[String with js.UndefOr[scala.Nothing]] = js.undefined
  var modificationTime: js.UndefOr[Double with js.UndefOr[scala.Nothing]] = js.undefined
  var size: js.UndefOr[Double with js.UndefOr[scala.Nothing]] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
}

object FileInfo {
  @scala.inline
  def apply(
    exists: `true` with `false` = null,
    isDirectory: js.UndefOr[Boolean with `false`] = js.undefined,
    md5: String with js.UndefOr[scala.Nothing] = null,
    modificationTime: js.UndefOr[Double with js.UndefOr[scala.Nothing]] = js.undefined,
    size: js.UndefOr[Double with js.UndefOr[scala.Nothing]] = js.undefined,
    uri: String = null
  ): FileInfo = {
    val __obj = js.Dynamic.literal()
    if (exists != null) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (!js.isUndefined(isDirectory)) __obj.updateDynamic("isDirectory")(isDirectory.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    if (!js.isUndefined(modificationTime)) __obj.updateDynamic("modificationTime")(modificationTime.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

