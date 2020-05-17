package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.ucb.XContent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a high level API to organize document templates
  *
  * Template information are saved as links to the original content and organized in groups. This data should be persistent and can be updated by calling
  * special method {@link XDocumentTemplates.update()} . A real implementation of this interface can do that on top of an ucb content provider. Method
  * {@link XDocumentTemplates.getContent()} force that.
  */
@js.native
trait XDocumentTemplates extends XInterface {
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  val Content: XContent = js.native
  /**
    * creates a new group
    * @param GroupName the name of the group to be created
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def addGroup(GroupName: String): Boolean = js.native
  /**
    * creates the template with the given name in the given group using the given URL
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param SourceURL specifies the position of template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.storeTemplate()
    */
  def addTemplate(GroupName: String, TemplateName: String, SourceURL: String): Boolean = js.native
  /**
    * provides access to the root of internal used hierarchy
    *
    * This content can be used for accessing the groups directly.
    * @returns the ucb content for template configuration
    */
  def getContent(): XContent = js.native
  /**
    * remove an existing group
    * @param GroupName the name of the group to be removed
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeGroup(GroupName: String): Boolean = js.native
  /**
    * remove a template from specified group
    * @param GroupName specifies the group which include the template
    * @param TemplateName specifies the template for delete
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def removeTemplate(GroupName: String, TemplateName: String): Boolean = js.native
  /**
    * rename an existing group
    * @param OldGroupName the old name of the group
    * @param NewGroupName the new name of the group
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameGroup(OldGroupName: String, NewGroupName: String): Boolean = js.native
  /**
    * rename a template inside specified group
    * @param GroupName specifies the group which include the template
    * @param OldTemplateName specifies the template for renaming
    * @param NewTemplateName specifies the new name for the template
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    */
  def renameTemplate(GroupName: String, OldTemplateName: String, NewTemplateName: String): Boolean = js.native
  /**
    * creates the template with the given name in the given group using the data from the storable
    * @param GroupName specifies the group
    * @param TemplateName specifies the template
    * @param Storable specifies the target
    * @returns `TRUE` if operation was successful ; `FALSE` otherwise
    * @see XDocumentTemplates.addTemplate()
    */
  def storeTemplate(GroupName: String, TemplateName: String, Storable: XStorable): Boolean = js.native
  /**
    * force an update for internal structures
    *
    * Because the templates are well known by links and not as direct content they can be outdated. An update force actualization of that to find wrong
    * links.
    */
  def update(): Unit = js.native
}

object XDocumentTemplates {
  @scala.inline
  def apply(
    Content: XContent,
    acquire: () => Unit,
    addGroup: String => Boolean,
    addTemplate: (String, String, String) => Boolean,
    getContent: () => XContent,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeGroup: String => Boolean,
    removeTemplate: (String, String) => Boolean,
    renameGroup: (String, String) => Boolean,
    renameTemplate: (String, String, String) => Boolean,
    storeTemplate: (String, String, XStorable) => Boolean,
    update: () => Unit
  ): XDocumentTemplates = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addGroup = js.Any.fromFunction1(addGroup), addTemplate = js.Any.fromFunction3(addTemplate), getContent = js.Any.fromFunction0(getContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeGroup = js.Any.fromFunction1(removeGroup), removeTemplate = js.Any.fromFunction2(removeTemplate), renameGroup = js.Any.fromFunction2(renameGroup), renameTemplate = js.Any.fromFunction3(renameTemplate), storeTemplate = js.Any.fromFunction3(storeTemplate), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[XDocumentTemplates]
  }
  @scala.inline
  implicit class XDocumentTemplatesOps[Self <: XDocumentTemplates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: XContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddGroup(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddTemplate(value: (String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetContent(value: () => XContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveGroup(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeGroup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveTemplate(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenameGroup(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameGroup")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRenameTemplate(value: (String, String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withStoreTemplate(value: (String, String, XStorable) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

