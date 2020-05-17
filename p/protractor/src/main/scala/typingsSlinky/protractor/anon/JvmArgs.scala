package typingsSlinky.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JvmArgs extends js.Object {
  /**
    * Additional command line options to pass to selenium. For example,
    * if you need to change the browser timeout, use
    * seleniumArgs: ['-browserTimeout=60']
    */
  var args: js.UndefOr[js.Any] = js.native
  /**
    * Additional command line jvm options to pass to selenium. For example,
    * if you need to change the browser driver, use
    * jvmArgs: ['-Dwebdriver.ie.driver=IEDriverServer_Win32_2.53.1.exe']
    */
  var jvmArgs: js.UndefOr[js.Array[String]] = js.native
  /**
    * The port to start the Selenium Server on, or null if the server should
    * find its own unused port.
    */
  var port: js.UndefOr[js.Any] = js.native
}

object JvmArgs {
  @scala.inline
  def apply(): JvmArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JvmArgs]
  }
  @scala.inline
  implicit class JvmArgsOps[Self <: JvmArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withJvmArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJvmArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jvmArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
  }
  
}

