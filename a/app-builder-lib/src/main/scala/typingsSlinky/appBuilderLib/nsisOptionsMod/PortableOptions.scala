package typingsSlinky.appBuilderLib.nsisOptionsMod

import typingsSlinky.appBuilderLib.appBuilderLibStrings.admin
import typingsSlinky.appBuilderLib.appBuilderLibStrings.highest
import typingsSlinky.appBuilderLib.appBuilderLibStrings.user
import typingsSlinky.appBuilderLib.coreMod.Publish
import typingsSlinky.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortableOptions
  extends TargetSpecificOptions
     with CommonNsisOptions {
  /**
    * The [requested execution level](http://nsis.sourceforge.net/Reference/RequestExecutionLevel) for Windows.
    * @default user
    */
  val requestExecutionLevel: js.UndefOr[user | highest | admin] = js.undefined
  /**
    * The unpack directory name in [TEMP](https://www.askvg.com/where-does-windows-store-temporary-files-and-how-to-change-temp-folder-location/) directory.
    *
    * Defaults to [uuid](https://github.com/segmentio/ksuid) of build (changed on each build of portable executable).
    */
  val unpackDirName: js.UndefOr[String] = js.undefined
}

object PortableOptions {
  @scala.inline
  def apply(
    artifactName: js.UndefOr[Null | String] = js.undefined,
    guid: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    requestExecutionLevel: user | highest | admin = null,
    unicode: js.UndefOr[Boolean] = js.undefined,
    unpackDirName: String = null,
    useZip: js.UndefOr[Boolean] = js.undefined,
    warningsAsErrors: js.UndefOr[Boolean] = js.undefined
  ): PortableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(guid)) __obj.updateDynamic("guid")(guid.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (requestExecutionLevel != null) __obj.updateDynamic("requestExecutionLevel")(requestExecutionLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    if (unpackDirName != null) __obj.updateDynamic("unpackDirName")(unpackDirName.asInstanceOf[js.Any])
    if (!js.isUndefined(useZip)) __obj.updateDynamic("useZip")(useZip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(warningsAsErrors)) __obj.updateDynamic("warningsAsErrors")(warningsAsErrors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableOptions]
  }
}

