package typingsSlinky.hexo.mod

import typingsSlinky.hexo.anon.Args
import typingsSlinky.hexo.anon.Console
import typingsSlinky.hexo.anon.Content
import typingsSlinky.hexo.hexoStrings.`new`
import typingsSlinky.hexo.hexoStrings.create
import typingsSlinky.hexo.hexoStrings.delete
import typingsSlinky.hexo.hexoStrings.deployAfter
import typingsSlinky.hexo.hexoStrings.deployBefore
import typingsSlinky.hexo.hexoStrings.exit
import typingsSlinky.hexo.hexoStrings.generateAfter
import typingsSlinky.hexo.hexoStrings.generateBefore
import typingsSlinky.hexo.hexoStrings.processAfter
import typingsSlinky.hexo.hexoStrings.processBefore
import typingsSlinky.hexo.hexoStrings.ready
import typingsSlinky.hexo.hexoStrings.skip
import typingsSlinky.hexo.hexoStrings.update
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hexo extends EventEmitter {
  
  val base_dir: String = js.native
  
  /**
    * Any console command can be called explicitly using the call method on the Hexo instance.
    */
  def call(name: String): js.Promise[_] = js.native
  def call(
    name: String,
    args: js.UndefOr[scala.Nothing],
    fn: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]
  ): js.Promise[_] = js.native
  def call(name: String, args: js.Any): js.Promise[_] = js.native
  def call(name: String, args: js.Any, fn: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): js.Promise[_] = js.native
  def call(name: String, fn: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): js.Promise[_] = js.native
  
  /**
    * Site settings in `_config.yml`
    */
  val config: HexoConfig = js.native
  
  val config_path: String = js.native
  
  val env: Args = js.native
  
  /**
    * You should call the `exit` method upon successful or unsuccessful completion of a console command.
    * This allows Hexo to exit gracefully and finish up important things such as saving the database.
    */
  def exit(): js.Promise[Unit] = js.native
  def exit(err: js.Any): js.Promise[Unit] = js.native
  
  val extend: Console = js.native
  
  /**
    * Load configuration and plugins.
    */
  def init(): js.Promise[Unit] = js.native
  
  /**
    * Loading all files in the `source` folder as well as the theme data.
    */
  def load(): js.Promise[_] = js.native
  def load(fn: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): js.Promise[_] = js.native
  
  /**
    * Local variables are used for template rendering, which is the `site` variable in templates.
    * https://hexo.io/api/locals
    */
  val locals: Locals = js.native
  
  /**
    * Logger object
    * https://www.npmjs.com/package/bunyan
    */
  val log: typingsSlinky.bunyan.mod.^ = js.native
  
  /**
    * Emitted after processing finishes. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: processAfter,
    fn: js.Function2[/* type */ create | update | skip | delete, /* path */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted before processing begins. This event returns a path representing the root directory of the box.
    */
  def on(
    ev: processBefore,
    fn: js.Function2[/* type */ create | update | skip | delete, /* path */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted after deployment finishes.
    */
  @JSName("on")
  def on_deployAfter(ev: deployAfter, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before deployment begins.
    */
  @JSName("on")
  def on_deployBefore(ev: deployBefore, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before Hexo exits.
    */
  @JSName("on")
  def on_exit(ev: exit, fn: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  /**
    * Emitted after generation finishes.
    */
  @JSName("on")
  def on_generateAfter(ev: generateAfter, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before generation begins.
    */
  @JSName("on")
  def on_generateBefore(ev: generateBefore, fn: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted after a new post has been created. This event returns the post data:
    */
  @JSName("on")
  def on_new(ev: `new`, fn: js.Function1[/* post */ Content, Unit]): this.type = js.native
  /**
    * Emitted after initialization finishes.
    */
  @JSName("on")
  def on_ready(ev: ready, fn: js.Function0[Unit]): this.type = js.native
  
  val plugin_dir: String = js.native
  
  val post: Post = js.native
  
  /**
    * Public folder. Where the static site will be generated
    */
  val public_dir: String = js.native
  
  val render: Render = js.native
  
  val route: Router = js.native
  
  val scaffold: Scaffold = js.native
  
  val scaffold_dir: String = js.native
  
  val script_dir: String = js.native
  
  val source: Box = js.native
  
  /**
    * Source folder. Where your content is stored
    */
  val source_dir: String = js.native
  
  val theme: Theme = js.native
  
  val theme_dir: String = js.native
  
  val theme_script_dir: String = js.native
  
  def unwatch(): Unit = js.native
  
  /**
    * The same things `load` does, but will also start watching for file changes continuously.
    */
  def watch(): js.Promise[_] = js.native
  def watch(fn: js.Function2[/* err */ js.Any, /* value */ js.Any, Unit]): js.Promise[_] = js.native
}
