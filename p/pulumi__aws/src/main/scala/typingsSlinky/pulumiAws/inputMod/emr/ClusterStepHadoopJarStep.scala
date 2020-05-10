package typingsSlinky.pulumiAws.inputMod.emr

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStepHadoopJarStep extends js.Object {
  var args: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var jar: Input[String] = js.native
  var mainClass: js.UndefOr[Input[String]] = js.native
  var properties: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterStepHadoopJarStep {
  @scala.inline
  def apply(jar: Input[String]): ClusterStepHadoopJarStep = {
    val __obj = js.Dynamic.literal(jar = jar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStepHadoopJarStep]
  }
  @scala.inline
  implicit class ClusterStepHadoopJarStepOps[Self <: ClusterStepHadoopJarStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJar(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArgs(value: Input[js.Array[Input[String]]]): Self = {
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
    def withMainClass(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainClass")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
  }
  
}

