package typingsSlinky.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializedIdPromisesMap extends js.Object {
  var initializedIdPromisesMap: StringDictionary[js.Promise[Unit]] = js.native
}

object InitializedIdPromisesMap {
  @scala.inline
  def apply(initializedIdPromisesMap: StringDictionary[js.Promise[Unit]]): InitializedIdPromisesMap = {
    val __obj = js.Dynamic.literal(initializedIdPromisesMap = initializedIdPromisesMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializedIdPromisesMap]
  }
  @scala.inline
  implicit class InitializedIdPromisesMapOps[Self <: InitializedIdPromisesMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitializedIdPromisesMap(value: StringDictionary[js.Promise[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializedIdPromisesMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

