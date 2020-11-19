package typingsSlinky.activexLibreoffice.com_.sun.star.sdb.tools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * encapsulates functionality which you might find useful when writing a database application which deals with query and table names.
  *
  * The most important task fulfilled by this instance is that it hides different naming restrictions from you, which are caused by server-side or client
  * side specialties.
  *
  * For instance, it can validate names against the characters allowed in the object names of a connection. Also, it relieves you from caring whether a
  * database supports queries in a `SELECT` statement's `FROM` part (known as "queries in queries"). In such databases, query and table names share a
  * common namespace, thus they must be unique. Using this interface, you can easily ensure this uniqueness.
  *
  * All of the functionality present in this interface depends on a connection, thus it entry point for obtaining it is a {@link
  * com.sun.star.sdb.Connection} service.
  *
  * The component itself does not have life-time control mechanisms, i.e. you cannot explicitly dispose it ( {@link
  * com.sun.star.lang.XComponent.dispose()} ), and you cannot be notified when it dies. ;  However, if your try to access any of its methods or
  * attributes, after the connection which was used to create it was closed, a {@link com.sun.star.lang.DisposedException} will be thrown.
  * @see XConnectionTools
  * @since OOo 2.0.4
  */
@js.native
trait XObjectNames extends js.Object {
  
  /**
    * checks whether a given name is allowed for a to-be-created table or query in the database.
    *
    * This method basically does the same checks as {@link isNameUsed()} and {@link isNameValid()} . In case the given name is not allowed, it throws an
    * exception. This error can be presented to the user, to give it a common experience in all cases where they're required to enter an object name.
    * @see isNameUsed
    * @see isNameValid
    * @see com.sun.star.sdb.ErrorMessageDialog
    * @see com.sun.star.sdb.InteractionHandler
    */
  def checkNameForCreate(CommandType: Double, Name: String): Unit = js.native
  
  /**
    * converts the given object name to a name which is valid in the database.
    *
    * The conversion takes place by converting every character which is neither allowed by the SQL-92 standard, nor part of the special characters supported
    * by the database, with an underscore character (_).
    * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
    */
  def convertToSQLName(Name: String): String = js.native
  
  /**
    * checks whether a given name is used as table respectively query name in the database.
    *
    * If in the database, tables and queries share a common namespace, this will be respected by this function.
    *
    * As before, the information you obtain by calling this method might be obsolete in the very moment you evaluate this, in case another process or thread
    * interferes. However, it's usually sufficiently up-to-date for purpose of using it in a database application driven by user interactions.
    * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object whose name should be checked. Must be either {@link com.sun.star.sdb
    * @param Name specifies the to-be-checked name of the object.
    * @returns `TRUE` if and only if the given name is legitimate as table respectively query name to be used in the database.
    * @see checkNameIsUsed
    * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
    */
  def isNameUsed(CommandType: Double, Name: String): Boolean = js.native
  
  /**
    * checks whether a given name is valid as table or query name
    *
    * For tables, the name must consist of characters allowed by the SQL-92 standard, plus characters allowed by the connection as extra name characters.
    *
    * For queries, names are nearly arbitrary, except that usual quoting characters must not be part of the name.
    * @see com.sun.star.sdbc.XDatabaseMetaData.getExtraNameCharacters
    */
  def isNameValid(CommandType: Double, Name: String): Boolean = js.native
  
  /**
    * suggests a (unique) table or query name
    *
    * If in the database, tables and queries share a common namespace, this will be respected by this function.
    *
    * Note that in an multi-threaded environment, the name you obtain here is not absolutely guaranteed to be unique. It is unique at the very moment the
    * function returns to you. But already when you evaluate the returned value, it might not be unique anymore, if another process or thread created a
    * query or table with this name.
    *
    * This implies that you cannot rely on the name's uniqueness, but you can use it as first guess to present to the user. In most cases, it will still be
    * sufficient when you are actually creating the table respectively query.
    * @param CommandType specifies the {@link com.sun.star.sdb.CommandType} of the object for which a unique name is to be generated. Must be either {@link co
    * @param BaseName specifies the base of the to-be-created object name. If empty, a default base name will be used.
    * @throws com::sun::star::lang::IllegalArgumentException if {@link CommandType} specifies an invalid command type.
    */
  def suggestName(CommandType: Double, BaseName: String): String = js.native
}
object XObjectNames {
  
  @scala.inline
  def apply(
    checkNameForCreate: (Double, String) => Unit,
    convertToSQLName: String => String,
    isNameUsed: (Double, String) => Boolean,
    isNameValid: (Double, String) => Boolean,
    suggestName: (Double, String) => String
  ): XObjectNames = {
    val __obj = js.Dynamic.literal(checkNameForCreate = js.Any.fromFunction2(checkNameForCreate), convertToSQLName = js.Any.fromFunction1(convertToSQLName), isNameUsed = js.Any.fromFunction2(isNameUsed), isNameValid = js.Any.fromFunction2(isNameValid), suggestName = js.Any.fromFunction2(suggestName))
    __obj.asInstanceOf[XObjectNames]
  }
  
  @scala.inline
  implicit class XObjectNamesOps[Self <: XObjectNames] (val x: Self) extends AnyVal {
    
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
    def setCheckNameForCreate(value: (Double, String) => Unit): Self = this.set("checkNameForCreate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConvertToSQLName(value: String => String): Self = this.set("convertToSQLName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNameUsed(value: (Double, String) => Boolean): Self = this.set("isNameUsed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsNameValid(value: (Double, String) => Boolean): Self = this.set("isNameValid", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuggestName(value: (Double, String) => String): Self = this.set("suggestName", js.Any.fromFunction2(value))
  }
}
