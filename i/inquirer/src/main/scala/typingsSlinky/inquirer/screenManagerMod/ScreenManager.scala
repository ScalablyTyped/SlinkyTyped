package typingsSlinky.inquirer.screenManagerMod

import typingsSlinky.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the functionality to manage the content of a console-screen.
  */
@js.native
trait ScreenManager extends js.Object {
  /**
    * Gets or sets the number of extra-lines below the prompt.
    */
  var extraLinesUnderPrompt: Double = js.native
  /**
    * Gets or sets the height of the screen.
    */
  var height: Double = js.native
  /**
    * Gets or sets an object for performing read from and write to the console.
    */
  var rl: Interface = js.native
  /**
    * Splits the `text` into multiple lines with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def breakLines(text: String, width: Double): js.Array[String] = js.native
  /**
    * Cleans all lines expect the first `extraLines`.
    *
    * @param extraLines
    * The number of lines at the begin to skip.
    */
  def clean(extraLines: Double): Unit = js.native
  /**
    * Releases all unmanaged resources.
    */
  def done(): Unit = js.native
  /**
    * Adds line-breaks to the specified `text` with the specified max `width`.
    *
    * @param text
    * The text to process.
    *
    * @param width
    * The max width of each line.
    */
  /* protected */ def forceLineReturn(text: String, width: Double): String = js.native
  /**
    * Identifies the width of the screen.
    *
    * @returns
    * The width of the screen.
    */
  /* protected */ def normalizedCliWidth(): Double = js.native
  /**
    * Releases the cursor.
    */
  def releaseCursor(): Unit = js.native
  /**
    * Renders content to the screen.
    *
    * @param content
    * The content to render.
    *
    * @param bottomContent
    * The content to render to the bottom of the screen.
    */
  def render(content: String, bottomContent: String): Unit = js.native
}

object ScreenManager {
  @scala.inline
  def apply(
    breakLines: (String, Double) => js.Array[String],
    clean: Double => Unit,
    done: () => Unit,
    extraLinesUnderPrompt: Double,
    forceLineReturn: (String, Double) => String,
    height: Double,
    normalizedCliWidth: () => Double,
    releaseCursor: () => Unit,
    render: (String, String) => Unit,
    rl: Interface
  ): ScreenManager = {
    val __obj = js.Dynamic.literal(breakLines = js.Any.fromFunction2(breakLines), clean = js.Any.fromFunction1(clean), done = js.Any.fromFunction0(done), extraLinesUnderPrompt = extraLinesUnderPrompt.asInstanceOf[js.Any], forceLineReturn = js.Any.fromFunction2(forceLineReturn), height = height.asInstanceOf[js.Any], normalizedCliWidth = js.Any.fromFunction0(normalizedCliWidth), releaseCursor = js.Any.fromFunction0(releaseCursor), render = js.Any.fromFunction2(render), rl = rl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenManager]
  }
  @scala.inline
  implicit class ScreenManagerOps[Self <: ScreenManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreakLines(value: (String, Double) => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakLines")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClean(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clean")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtraLinesUnderPrompt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLinesUnderPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForceLineReturn(value: (String, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceLineReturn")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedCliWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedCliWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReleaseCursor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseCursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRl(value: Interface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

