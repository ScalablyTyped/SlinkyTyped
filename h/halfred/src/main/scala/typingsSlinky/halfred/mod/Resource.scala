package typingsSlinky.halfred.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends js.Object {
  
  /** Alias for allEmbeddedResourceArrays() */
  def allEmbeddedArrays(): ResourceCollection = js.native
  
  /**
    * Returns an object which has an array for each embedded resource that was present in the
    * source object.
    * See below why each embedded resource is represented as an array. Each element of any of
    * this arrays is in turn a Resource object.
    */
  def allEmbeddedResourceArrays(): ResourceCollection = js.native
  
  /** Alias for allEmbeddedResourceArrays() */
  def allEmbeddedResources(): ResourceCollection = js.native
  
  /**
    * Returns an object which has an array for each link that was present in the source object.
    * See below why each link is represented as an array.
    */
  def allLinkArrays(): LinkCollection = js.native
  
  /** Alias for allLinkArrays() */
  def allLinks(): LinkCollection = js.native
  
  /**
    * Returns the curie with the given name, if any. The returned object is a link object, which
    * means it can be templated etc. See below for link object API.
    */
  def curie(name: String): Link = js.native
  
  /**
    * Returns the array of CURIEs. Each object in the array is a link object, which means it
    * can be templated etc. See below for the link object API.
    */
  def curieArray(): js.Array[Link] = js.native
  
  /** Alias for embeddedResource(key) */
  def embedded(key: String): Resource = js.native
  
  /** Alias for embeddedResourceArray() */
  def embeddedArray(key: String): js.Array[Resource] = js.native
  
  /**
    * Returns the first element of the array of embedded resources for the given key or null if
    * there are no embedded resources for this key. The returend object is a Resource object.
    */
  def embeddedResource(key: String): Resource = js.native
  
  /**
    * Returns the array of embedded resources for the given key, or null if there are no embedded
    * resources for this key. Each element of this arrays is in turn a Resource object.
    */
  def embeddedResourceArray(key: String): js.Array[Resource] = js.native
  
  /**
    * Returns true if the resource has any CURIEs (Compact URIs).
    *
    * @see http://www.w3.org/TR/2010/NOTE-curie-20101216/
    */
  def hasCuries(): Boolean = js.native
  
  /**
    * Returns the first element of the array of links for the given key or null if there are no
    * links for this key.
    */
  def link(key: String): Link = js.native
  
  /**
    * Returns the array of links for the given key, or null if there are no links for this key.
    */
  def linkArray(key: String): js.Array[Link] = js.native
  
  /**
    * Returns the unmodified, original object that was parsed to this resource. This is rather
    * uninteresting for the source object you give to the parse method (because you probably
    * still have a reference to the source object) but it is a convenient way to get the part of
    * the source object that corresponds to an embedded resource.
    */
  def original(): js.Any = js.native
  
  /**
    * Returns the compact URI for the given full URL, if any
    */
  def reverseResolveCurie(fullUrl: String): String = js.native
  
  /**
    * Alias for validationIssues()
    */
  def validation(): js.Any = js.native
  
  /**
    * Returns all validation issues. Validation issues are only gathered if validation has been
    * turned on by calling ``halfred.enableValidation()`` before calling ``halfred.parse``.
    */
  def validationIssues(): js.Any = js.native
}
object Resource {
  
  @scala.inline
  def apply(
    allEmbeddedArrays: () => ResourceCollection,
    allEmbeddedResourceArrays: () => ResourceCollection,
    allEmbeddedResources: () => ResourceCollection,
    allLinkArrays: () => LinkCollection,
    allLinks: () => LinkCollection,
    curie: String => Link,
    curieArray: () => js.Array[Link],
    embedded: String => Resource,
    embeddedArray: String => js.Array[Resource],
    embeddedResource: String => Resource,
    embeddedResourceArray: String => js.Array[Resource],
    hasCuries: () => Boolean,
    link: String => Link,
    linkArray: String => js.Array[Link],
    original: () => js.Any,
    reverseResolveCurie: String => String,
    validation: () => js.Any,
    validationIssues: () => js.Any
  ): Resource = {
    val __obj = js.Dynamic.literal(allEmbeddedArrays = js.Any.fromFunction0(allEmbeddedArrays), allEmbeddedResourceArrays = js.Any.fromFunction0(allEmbeddedResourceArrays), allEmbeddedResources = js.Any.fromFunction0(allEmbeddedResources), allLinkArrays = js.Any.fromFunction0(allLinkArrays), allLinks = js.Any.fromFunction0(allLinks), curie = js.Any.fromFunction1(curie), curieArray = js.Any.fromFunction0(curieArray), embedded = js.Any.fromFunction1(embedded), embeddedArray = js.Any.fromFunction1(embeddedArray), embeddedResource = js.Any.fromFunction1(embeddedResource), embeddedResourceArray = js.Any.fromFunction1(embeddedResourceArray), hasCuries = js.Any.fromFunction0(hasCuries), link = js.Any.fromFunction1(link), linkArray = js.Any.fromFunction1(linkArray), original = js.Any.fromFunction0(original), reverseResolveCurie = js.Any.fromFunction1(reverseResolveCurie), validation = js.Any.fromFunction0(validation), validationIssues = js.Any.fromFunction0(validationIssues))
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    
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
    def setAllEmbeddedArrays(value: () => ResourceCollection): Self = this.set("allEmbeddedArrays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllEmbeddedResourceArrays(value: () => ResourceCollection): Self = this.set("allEmbeddedResourceArrays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllEmbeddedResources(value: () => ResourceCollection): Self = this.set("allEmbeddedResources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllLinkArrays(value: () => LinkCollection): Self = this.set("allLinkArrays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllLinks(value: () => LinkCollection): Self = this.set("allLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCurie(value: String => Link): Self = this.set("curie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCurieArray(value: () => js.Array[Link]): Self = this.set("curieArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmbedded(value: String => Resource): Self = this.set("embedded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmbeddedArray(value: String => js.Array[Resource]): Self = this.set("embeddedArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmbeddedResource(value: String => Resource): Self = this.set("embeddedResource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmbeddedResourceArray(value: String => js.Array[Resource]): Self = this.set("embeddedResourceArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasCuries(value: () => Boolean): Self = this.set("hasCuries", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLink(value: String => Link): Self = this.set("link", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkArray(value: String => js.Array[Link]): Self = this.set("linkArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOriginal(value: () => js.Any): Self = this.set("original", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverseResolveCurie(value: String => String): Self = this.set("reverseResolveCurie", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidation(value: () => js.Any): Self = this.set("validation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidationIssues(value: () => js.Any): Self = this.set("validationIssues", js.Any.fromFunction0(value))
  }
}
