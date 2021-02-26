package typingsSlinky.npmUserPackages

import typingsSlinky.npmUserPackages.anon.Bugs
import typingsSlinky.npmUserPackages.anon.Email
import typingsSlinky.npmUserPackages.anon.Username
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get packages by a npm user.
    * @param username User to fetch packages from.
    */
  @JSImport("npm-user-packages", JSImport.Namespace)
  @js.native
  def apply(username: String): js.Promise[js.Array[PackageData]] = js.native
  
  @js.native
  trait PackageData extends StObject {
    
    var author: Email = js.native
    
    var date: String = js.native
    
    var description: String = js.native
    
    var keywords: js.Array[String] = js.native
    
    var links: Bugs = js.native
    
    var maintainers: js.Array[Username] = js.native
    
    var name: String = js.native
    
    var publisher: Username = js.native
    
    var scope: String = js.native
    
    var version: String = js.native
  }
  object PackageData {
    
    @scala.inline
    def apply(
      author: Email,
      date: String,
      description: String,
      keywords: js.Array[String],
      links: Bugs,
      maintainers: js.Array[Username],
      name: String,
      publisher: Username,
      scope: String,
      version: String
    ): PackageData = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], keywords = keywords.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], maintainers = maintainers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PackageData]
    }
    
    @scala.inline
    implicit class PackageDataMutableBuilder[Self <: PackageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Email): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLinks(value: Bugs): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainers(value: js.Array[Username]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersVarargs(value: Username*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublisher(value: Username): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
