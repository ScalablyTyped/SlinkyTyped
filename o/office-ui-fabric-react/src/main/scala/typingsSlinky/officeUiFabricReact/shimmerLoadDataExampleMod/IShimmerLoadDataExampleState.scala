package typingsSlinky.officeUiFabricReact.shimmerLoadDataExampleMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShimmerLoadDataExampleState extends js.Object {
  var contentOne: js.UndefOr[String] = js.native
  var examplePersona: js.UndefOr[IPersonaProps] = js.native
  var isDataLoadedOne: js.UndefOr[Boolean] = js.native
  var isDataLoadedTwo: js.UndefOr[Boolean] = js.native
}

object IShimmerLoadDataExampleState {
  @scala.inline
  def apply(): IShimmerLoadDataExampleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerLoadDataExampleState]
  }
  @scala.inline
  implicit class IShimmerLoadDataExampleStateOps[Self <: IShimmerLoadDataExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOne(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOne")(js.undefined)
        ret
    }
    @scala.inline
    def withExamplePersona(value: IPersonaProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examplePersona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExamplePersona: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("examplePersona")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataLoadedOne(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoadedOne")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataLoadedOne: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoadedOne")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDataLoadedTwo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoadedTwo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDataLoadedTwo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDataLoadedTwo")(js.undefined)
        ret
    }
  }
  
}

