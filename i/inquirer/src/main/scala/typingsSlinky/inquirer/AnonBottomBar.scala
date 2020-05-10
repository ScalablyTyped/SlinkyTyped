package typingsSlinky.inquirer

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.inquirer.bottomBarMod.^
import typingsSlinky.inquirer.mod.StreamOptions
import typingsSlinky.inquirer.mod.prompts.PromptCollection
import typingsSlinky.inquirer.mod.ui.BottomBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBottomBar extends js.Object {
  /**
    * Represents the bottom-bar UI.
    */
  var BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^] = js.native
  /**
    * Represents the prompt ui.
    */
  var Prompt: Instantiable2[
    /* prompts */ PromptCollection, 
    js.UndefOr[/* options */ StreamOptions], 
    typingsSlinky.inquirer.promptMod.^
  ] = js.native
}

object AnonBottomBar {
  @scala.inline
  def apply(
    BottomBar: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^],
    Prompt: Instantiable2[
      /* prompts */ PromptCollection, 
      js.UndefOr[/* options */ StreamOptions], 
      typingsSlinky.inquirer.promptMod.^
    ]
  ): AnonBottomBar = {
    val __obj = js.Dynamic.literal(BottomBar = BottomBar.asInstanceOf[js.Any], Prompt = Prompt.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomBar]
  }
  @scala.inline
  implicit class AnonBottomBarOps[Self <: AnonBottomBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottomBar(value: Instantiable1[js.UndefOr[/* options */ BottomBarOptions], ^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BottomBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrompt(
      value: Instantiable2[
          /* prompts */ PromptCollection, 
          js.UndefOr[/* options */ StreamOptions], 
          typingsSlinky.inquirer.promptMod.^
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prompt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

