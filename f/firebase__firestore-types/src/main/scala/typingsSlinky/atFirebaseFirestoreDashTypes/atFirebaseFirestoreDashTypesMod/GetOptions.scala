package typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod

import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.cache
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.default
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesStrings.server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetOptions extends js.Object {
  val source: js.UndefOr[default | server | cache] = js.undefined
}

object GetOptions {
  @scala.inline
  def apply(source: default | server | cache = null): GetOptions = {
    val __obj = js.Dynamic.literal()
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOptions]
  }
}

