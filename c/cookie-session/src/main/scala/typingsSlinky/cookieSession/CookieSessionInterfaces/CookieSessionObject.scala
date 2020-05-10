package typingsSlinky.cookieSession.CookieSessionInterfaces

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieSessionObject
  extends /* propertyName */ StringDictionary[js.Any] {
  /**
    * Is true if the session has been changed during the request.
    */
  var isChanged: js.UndefOr[Boolean] = js.native
  /**
    * Is true if the session is new.
    */
  var isNew: js.UndefOr[Boolean] = js.native
  /**
    * Determine if the session has been populated with data or is empty.
    */
  var isPopulated: js.UndefOr[Boolean] = js.native
}

object CookieSessionObject {
  @scala.inline
  def apply(): CookieSessionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieSessionObject]
  }
  @scala.inline
  implicit class CookieSessionObjectOps[Self <: CookieSessionObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNew(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNew")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPopulated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopulated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPopulated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPopulated")(js.undefined)
        ret
    }
  }
  
}

