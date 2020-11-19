package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.Locale
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XLocalizable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to function descriptions and user-visible names. */
@js.native
trait XAddIn extends XLocalizable {
  
  /**
    * returns the description of the specified argument.
    *
    * The argument description is shown to the user when prompting for arguments. It may be translated to the current language of the {@link AddIn} .
    * @param aProgrammaticFunctionName is the exact name of a method within its interface.
    * @param nArgument the index of the argument (0-based).
    * @returns the description of the specified argument.
    */
  def getArgumentDescription(aProgrammaticFunctionName: String, nArgument: Double): String = js.native
  
  /**
    * returns the user-visible name of the specified argument.
    *
    * The argument name is shown to the user when prompting for arguments. It should be a single word and may be translated to the current language of the
    * {@link AddIn} .
    * @param aProgrammaticFunctionName is the exact name of a method within its interface.
    * @param nArgument the index of the argument (0-based).
    * @returns the user-visible name of the specified argument.
    */
  def getDisplayArgumentName(aProgrammaticFunctionName: String, nArgument: Double): String = js.native
  
  /**
    * returns the user-visible name of the category the function belongs to.
    *
    * This is used when category names are shown to the user.
    * @param aProgrammaticFunctionName is the exact name of a method within its interface.
    * @returns the user-visible category name the specified function belongs to.
    */
  def getDisplayCategoryName(aProgrammaticFunctionName: String): String = js.native
  
  /**
    * returns the user-visible function name for an internal name.
    *
    * The user-visible name of a function is the name shown to the user. It may be translated to the current language of the {@link AddIn} , so it is never
    * stored in files. It should be a single word and is used when entering or displaying formulas.
    * @param aProgrammaticName is the exact name of a method within its interface.
    * @returns the user-visible name of the specified function.
    */
  def getDisplayFunctionName(aProgrammaticName: String): String = js.native
  
  /**
    * returns the description of a function.
    *
    * The description is shown to the user when selecting functions. It may be translated to the current language of the {@link AddIn} .
    * @param aProgrammaticName is the exact name of a method within its interface.
    * @returns the description of the specified function.
    */
  def getFunctionDescription(aProgrammaticName: String): String = js.native
  
  /**
    * returns the programmatic name of the category the function belongs to.
    *
    * The category name is used to group similar functions together. The programmatic category name should always be in English, it is never shown to the
    * user. It should be one of the following names if the function falls into the corresponding category.
    *
    * **Database **: for functions that operate with data organized in tabular form like databases.;
    *
    * **Date&Time **: for functions that deal with date or time values.;
    *
    * **Financial **: for functions that solve financial problems.;
    *
    * **Information **: for functions that provide information about cells.;
    *
    * **Logical **: for functions that deal with logical expressions.;
    *
    * **Mathematical **: for mathematical functions.;
    *
    * **Matrix **: for matrix functions.;
    *
    * **Statistical **: for statistical functions.;
    *
    * **Spreadsheet**: for functions that deal with cell ranges.;
    *
    * **Text **: for functions that deal with text strings.;
    *
    * **Add-In **: for additional functions.
    * @param aProgrammaticFunctionName is the exact name of a method within its interface.
    * @returns the category name the specified function belongs to.
    */
  def getProgrammaticCategoryName(aProgrammaticFunctionName: String): String = js.native
  
  /**
    * returns the internal function name for an user-visible name.
    *
    * The user-visible name of a function is the name shown to the user. It may be translated to the current language of the {@link AddIn} , so it is never
    * stored in files. It should be a single word and is used when entering or displaying formulas.
    *
    * Attention: The method name contains a spelling error. Due to compatibility reasons the name cannot be changed.
    * @param aDisplayName the user-visible name of a function.
    * @returns the exact name of the method within its interface.
    */
  def getProgrammaticFuntionName(aDisplayName: String): String = js.native
}
object XAddIn {
  
  @scala.inline
  def apply(
    Locale: Locale,
    acquire: () => Unit,
    getArgumentDescription: (String, Double) => String,
    getDisplayArgumentName: (String, Double) => String,
    getDisplayCategoryName: String => String,
    getDisplayFunctionName: String => String,
    getFunctionDescription: String => String,
    getLocale: () => Locale,
    getProgrammaticCategoryName: String => String,
    getProgrammaticFuntionName: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setLocale: Locale => Unit
  ): XAddIn = {
    val __obj = js.Dynamic.literal(Locale = Locale.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getArgumentDescription = js.Any.fromFunction2(getArgumentDescription), getDisplayArgumentName = js.Any.fromFunction2(getDisplayArgumentName), getDisplayCategoryName = js.Any.fromFunction1(getDisplayCategoryName), getDisplayFunctionName = js.Any.fromFunction1(getDisplayFunctionName), getFunctionDescription = js.Any.fromFunction1(getFunctionDescription), getLocale = js.Any.fromFunction0(getLocale), getProgrammaticCategoryName = js.Any.fromFunction1(getProgrammaticCategoryName), getProgrammaticFuntionName = js.Any.fromFunction1(getProgrammaticFuntionName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setLocale = js.Any.fromFunction1(setLocale))
    __obj.asInstanceOf[XAddIn]
  }
  
  @scala.inline
  implicit class XAddInOps[Self <: XAddIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetArgumentDescription(value: (String, Double) => String): Self = this.set("getArgumentDescription", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDisplayArgumentName(value: (String, Double) => String): Self = this.set("getDisplayArgumentName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetDisplayCategoryName(value: String => String): Self = this.set("getDisplayCategoryName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDisplayFunctionName(value: String => String): Self = this.set("getDisplayFunctionName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFunctionDescription(value: String => String): Self = this.set("getFunctionDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProgrammaticCategoryName(value: String => String): Self = this.set("getProgrammaticCategoryName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetProgrammaticFuntionName(value: String => String): Self = this.set("getProgrammaticFuntionName", js.Any.fromFunction1(value))
  }
}
