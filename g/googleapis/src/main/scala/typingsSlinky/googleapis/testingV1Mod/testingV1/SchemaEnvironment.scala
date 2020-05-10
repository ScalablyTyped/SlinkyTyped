package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environment in which the test is run.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * An Android device which must be used with an Android test.
    */
  var androidDevice: js.UndefOr[SchemaAndroidDevice] = js.native
  /**
    * An iOS device which must be used with an iOS test.
    */
  var iosDevice: js.UndefOr[SchemaIosDevice] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDevice(value: SchemaAndroidDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withIosDevice(value: SchemaIosDevice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDevice")(js.undefined)
        ret
    }
  }
  
}

