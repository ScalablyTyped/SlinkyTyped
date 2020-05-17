package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Script Module containing some scripting code in a certain scripting language
  * @deprecated Deprecated
  */
@js.native
trait XStarBasicModuleInfo extends XInterface {
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  val Language: String = js.native
  /** returns the name of the module */
  val Name: String = js.native
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  val Source: String = js.native
  /** returns the type of the script language as string, for example, "StarBasic" or "JavaScript". */
  def getLanguage(): String = js.native
  /** returns the name of the module */
  def getName(): String = js.native
  /**
    * returns the script source code as string.
    *
    * The code has to correspond with the language defined by Language.
    */
  def getSource(): String = js.native
}

object XStarBasicModuleInfo {
  @scala.inline
  def apply(
    Language: String,
    Name: String,
    Source: String,
    acquire: () => Unit,
    getLanguage: () => String,
    getName: () => String,
    getSource: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XStarBasicModuleInfo = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getLanguage = js.Any.fromFunction0(getLanguage), getName = js.Any.fromFunction0(getName), getSource = js.Any.fromFunction0(getSource), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XStarBasicModuleInfo]
  }
  @scala.inline
  implicit class XStarBasicModuleInfoOps[Self <: XStarBasicModuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetLanguage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLanguage")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSource(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSource")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

