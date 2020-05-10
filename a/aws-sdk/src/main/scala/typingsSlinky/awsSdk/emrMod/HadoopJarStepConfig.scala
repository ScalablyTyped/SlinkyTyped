package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HadoopJarStepConfig extends js.Object {
  /**
    * A list of command line arguments passed to the JAR file's main function when executed.
    */
  var Args: js.UndefOr[XmlStringList] = js.native
  /**
    * A path to a JAR file run during the step.
    */
  var Jar: XmlString = js.native
  /**
    * The name of the main class in the specified Java file. If not specified, the JAR file should specify a Main-Class in its manifest file.
    */
  var MainClass: js.UndefOr[XmlString] = js.native
  /**
    * A list of Java properties that are set when the step runs. You can use these properties to pass key value pairs to your main function.
    */
  var Properties: js.UndefOr[KeyValueList] = js.native
}

object HadoopJarStepConfig {
  @scala.inline
  def apply(Jar: XmlString): HadoopJarStepConfig = {
    val __obj = js.Dynamic.literal(Jar = Jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[HadoopJarStepConfig]
  }
  @scala.inline
  implicit class HadoopJarStepConfigOps[Self <: HadoopJarStepConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJar(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Jar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: XmlStringList): Self = {
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
    def withMainClass(value: XmlString): Self = {
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
    def withProperties(value: KeyValueList): Self = {
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

