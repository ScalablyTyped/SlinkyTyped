package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import typingsSlinky.maximMazurokGapiClientBooks.anon.Bannerwithcontentcontainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Discoveryclusters extends StObject {
  
  var clusters: js.UndefOr[js.Array[Bannerwithcontentcontainer]] = js.native
  
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.native
  
  var totalClusters: js.UndefOr[Double] = js.native
}
object Discoveryclusters {
  
  @scala.inline
  def apply(): Discoveryclusters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Discoveryclusters]
  }
  
  @scala.inline
  implicit class DiscoveryclustersMutableBuilder[Self <: Discoveryclusters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[Bannerwithcontentcontainer]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: Bannerwithcontentcontainer*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTotalClusters(value: Double): Self = StObject.set(x, "totalClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalClustersUndefined: Self = StObject.set(x, "totalClusters", js.undefined)
  }
}
