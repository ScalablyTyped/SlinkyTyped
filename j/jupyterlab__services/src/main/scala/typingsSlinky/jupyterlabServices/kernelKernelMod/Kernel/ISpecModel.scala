package typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kernel Spec interface.
  *
  * #### Notes
  * See [Kernel specs](https://jupyter-client.readthedocs.io/en/latest/kernels.html#kernelspecs).
  */
@js.native
trait ISpecModel extends JSONObject {
  /**
    * A list of command line arguments used to start the kernel.
    */
  val argv: js.Array[String] = js.native
  /**
    * The kernel’s name as it should be displayed in the UI.
    */
  val display_name: String = js.native
  /**
    * A dictionary of environment variables to set for the kernel.
    */
  val env: js.UndefOr[JSONObject] = js.native
  /**
    * The name of the language of the kernel.
    */
  val language: String = js.native
  /**
    * A dictionary of additional attributes about this kernel; used by clients to aid in kernel selection.
    */
  val metadata: js.UndefOr[JSONObject] = js.native
  /**
    * The name of the kernel spec.
    */
  val name: String = js.native
  /**
    * A mapping of resource file name to download path.
    */
  val resources: StringDictionary[String] = js.native
}

object ISpecModel {
  @scala.inline
  def apply(
    argv: js.Array[String],
    display_name: String,
    language: String,
    name: String,
    resources: StringDictionary[String]
  ): ISpecModel = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpecModel]
  }
  @scala.inline
  implicit class ISpecModelOps[Self <: ISpecModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgv(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("argv")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResources(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: JSONObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

