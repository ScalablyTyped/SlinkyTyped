package typingsSlinky.frctlFractal.mod

import typingsSlinky.frctlFractal.anon.Author
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FractalConfig extends js.Object {
  var project: js.UndefOr[Author] = js.native
  @JSName("project.author")
  var projectDotauthor: js.UndefOr[String] = js.native
  @JSName("project.title")
  var projectDottitle: js.UndefOr[String] = js.native
  @JSName("project.version")
  var projectDotversion: js.UndefOr[String] = js.native
}

object FractalConfig {
  @scala.inline
  def apply(): FractalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractalConfig]
  }
  @scala.inline
  implicit class FractalConfigOps[Self <: FractalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProject(value: Author): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectDotauthor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.author")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDotauthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.author")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectDottitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDottitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.title")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectDotversion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDotversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project.version")(js.undefined)
        ret
    }
  }
  
}

