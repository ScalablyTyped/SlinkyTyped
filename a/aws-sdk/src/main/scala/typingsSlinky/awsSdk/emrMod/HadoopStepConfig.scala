package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HadoopStepConfig extends js.Object {
  /**
    * The list of command line arguments to pass to the JAR file's main function for execution.
    */
  var Args: js.UndefOr[StringList] = js.native
  /**
    * The path to the JAR file that runs during the step.
    */
  var Jar: js.UndefOr[String] = js.native
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a main class in its manifest file.
    */
  var MainClass: js.UndefOr[String] = js.native
  /**
    * The list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[StringMap] = js.native
}

object HadoopStepConfig {
  @scala.inline
  def apply(): HadoopStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HadoopStepConfig]
  }
  @scala.inline
  implicit class HadoopStepConfigOps[Self <: HadoopStepConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Args")(js.undefined)
        ret
    }
    @scala.inline
    def withJar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jar")(js.undefined)
        ret
    }
    @scala.inline
    def withMainClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainClass")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(js.undefined)
        ret
    }
  }
  
}

