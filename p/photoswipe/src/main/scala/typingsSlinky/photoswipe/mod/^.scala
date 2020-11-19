package typingsSlinky.photoswipe.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base PhotoSwipe class. Derived from http://photoswipe.com/documentation/api.html
  */
@JSImport("photoswipe", JSImport.Namespace)
@js.native
class ^[T /* <: Options */] protected () extends PhotoSwipe[T] {
  /**
    * Constructs a PhotoSwipe.
    *
    * Note: By default Typescript will not correctly typecheck the options parameter. Make sure to
    * explicitly annotate the type of options being passed into the constructor like so:
    *
    * new PhotoSwipe<PhotoSwipeUI_Default.Options>( element, PhotoSwipeUI_Default, items, options );
    *
    * It accepts 4 arguments:
    *
    * (1) PhotoSwipe element (it must be added to DOM).
    * (2) PhotoSwipe UI class. If you included default photoswipe-ui-default.js, class will be PhotoSwipeUI_Default. Can be "false".
    * (3) Array with objects (slides).
    * (4) Options.
    */
  def this(
    pswpElement: HTMLElement,
    uiConstructor: Instantiable2[/* pswp */ PhotoSwipe[T], /* framework */ UIFramework, UI[T]],
    items: js.Array[Item],
    options: T
  ) = this()
  def this(pswpElement: HTMLElement, uiConstructor: Boolean, items: js.Array[Item], options: T) = this()
}
