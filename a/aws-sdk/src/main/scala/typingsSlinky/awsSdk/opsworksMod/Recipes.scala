package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipes extends js.Object {
  /**
    * An array of custom recipe names to be run following a configure event.
    */
  var Configure: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a deploy event.
    */
  var Deploy: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a setup event.
    */
  var Setup: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a shutdown event.
    */
  var Shutdown: js.UndefOr[Strings] = js.native
  /**
    * An array of custom recipe names to be run following a undeploy event.
    */
  var Undeploy: js.UndefOr[Strings] = js.native
}

object Recipes {
  @scala.inline
  def apply(): Recipes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recipes]
  }
  @scala.inline
  implicit class RecipesOps[Self <: Recipes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigure(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configure")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploy(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Deploy")(js.undefined)
        ret
    }
    @scala.inline
    def withSetup(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Setup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Setup")(js.undefined)
        ret
    }
    @scala.inline
    def withShutdown(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shutdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withUndeploy(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Undeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndeploy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Undeploy")(js.undefined)
        ret
    }
  }
  
}

