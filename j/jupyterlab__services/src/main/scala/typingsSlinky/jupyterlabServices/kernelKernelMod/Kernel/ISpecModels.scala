package typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The available kernelSpec models.
  *
  * #### Notes
  * See the [Jupyter Notebook API](http://petstore.swagger.io/?url=https://raw.githubusercontent.com/jupyter/notebook/master/notebook/services/api/api.yaml#!/kernelspecs).
  */
@js.native
trait ISpecModels extends JSONObject {
  /**
    * The name of the default kernel spec.
    */
  var default: String = js.native
  /**
    * A mapping of kernel spec name to spec.
    */
  val kernelspecs: StringDictionary[ISpecModel] = js.native
}

object ISpecModels {
  @scala.inline
  def apply(default: String, kernelspecs: StringDictionary[ISpecModel]): ISpecModels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpecModels]
  }
  @scala.inline
  implicit class ISpecModelsOps[Self <: ISpecModels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKernelspecs(value: StringDictionary[ISpecModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kernelspecs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

