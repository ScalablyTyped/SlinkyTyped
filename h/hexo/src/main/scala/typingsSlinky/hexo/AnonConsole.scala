package typingsSlinky.hexo

import typingsSlinky.hexo.mod.extend.Console
import typingsSlinky.hexo.mod.extend.Deployer
import typingsSlinky.hexo.mod.extend.Filter
import typingsSlinky.hexo.mod.extend.Generator
import typingsSlinky.hexo.mod.extend.Helper
import typingsSlinky.hexo.mod.extend.Migrator
import typingsSlinky.hexo.mod.extend.Processor
import typingsSlinky.hexo.mod.extend.Renderer
import typingsSlinky.hexo.mod.extend.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConsole extends js.Object {
  /**
    * The console forms the bridge between Hexo and its users. It registers and describes the available console commands.
    */
  val console: Console = js.native
  /**
    * A deployer helps users quickly deploy their site to a remote server without complicated commands.
    */
  val deployer: Deployer = js.native
  /**
    * A filter is used to modify some specified data. Hexo passes data to filters in sequence and the filters then modify the data one after the other.
    */
  val filter: Filter = js.native
  /**
    * A generator builds routes based on processed files.
    */
  val generator: Generator = js.native
  /**
    * A helper makes it easy to quickly add snippets to your templates. We recommend using helpers instead of templates when you’re dealing with more complicated code.
    */
  val helper: Helper = js.native
  /**
    * A migrator helps users migrate from other systems to Hexo.
    */
  val migrator: Migrator = js.native
  /**
    * A processor is used to process source files in the source folder.
    */
  val processor: Processor = js.native
  /**
    * A renderer is used to render content.
    */
  val renderer: Renderer = js.native
  /**
    * A tag allows users to quickly and easily insert snippets into their posts.
    */
  val tag: Tag = js.native
}

object AnonConsole {
  @scala.inline
  def apply(
    console: Console,
    deployer: Deployer,
    filter: Filter,
    generator: Generator,
    helper: Helper,
    migrator: Migrator,
    processor: Processor,
    renderer: Renderer,
    tag: Tag
  ): AnonConsole = {
    val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], deployer = deployer.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], migrator = migrator.asInstanceOf[js.Any], processor = processor.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConsole]
  }
  @scala.inline
  implicit class AnonConsoleOps[Self <: AnonConsole] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsole(value: Console): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("console")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeployer(value: Deployer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: Filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerator(value: Generator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelper(value: Helper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMigrator(value: Migrator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("migrator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessor(value: Processor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderer(value: Renderer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: Tag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

