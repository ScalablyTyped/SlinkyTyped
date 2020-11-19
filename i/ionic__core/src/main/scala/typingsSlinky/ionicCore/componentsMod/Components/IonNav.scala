package typingsSlinky.ionicCore.componentsMod.Components

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouteID
import typingsSlinky.ionicCore.interfaceMod.RouteWrite
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.mod.ComponentProps
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import typingsSlinky.ionicCore.mod.ViewController
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import typingsSlinky.ionicCore.navInterfaceMod.NavComponentWithProps
import typingsSlinky.ionicCore.navInterfaceMod.NavOptions
import typingsSlinky.ionicCore.navInterfaceMod.TransitionDoneFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonNav extends js.Object {
  
  /**
    * If `true`, the nav should animate the transition of components.
    */
  var animated: Boolean = js.native
  
  /**
    * By default `ion-nav` animates transition between pages based in the mode (ios or material design). However, this property allows to create custom transition using `AnimateBuilder` functions.
    */
  var animation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * Returns `true` if the current view can go back.
    * @param view The view to check.
    */
  def canGoBack(): js.Promise[Boolean] = js.native
  def canGoBack(view: ViewController): js.Promise[Boolean] = js.native
  
  var delegate: js.UndefOr[FrameworkDelegate] = js.native
  
  /**
    * Get the active view.
    */
  def getActive(): js.Promise[js.UndefOr[ViewController]] = js.native
  
  /**
    * Get the view at the specified index.
    * @param index The index of the view.
    */
  def getByIndex(index: Double): js.Promise[js.UndefOr[ViewController]] = js.native
  
  /**
    * Get the previous view.
    * @param view The view to get.
    */
  def getPrevious(): js.Promise[js.UndefOr[ViewController]] = js.native
  def getPrevious(view: ViewController): js.Promise[js.UndefOr[ViewController]] = js.native
  
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  
  def insert(insertIndex: Double): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: String): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: ComponentProps[String],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: ComponentProps[String],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: String,
    componentProps: ComponentProps[String],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  /**
    * Inserts a component into the navigation stack at the specified index. This is useful to add a component at any point in the navigation stack.
    * @param insertIndex The index to insert the component at in the stack.
    * @param component The component to insert into the navigation stack.
    * @param componentProps Any properties of the component.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def insert(insertIndex: Double, component: js.Function): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: Null,
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: Null, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: ComponentProps[Null],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: ComponentProps[Null],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: Null,
    componentProps: ComponentProps[Null],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: typingsSlinky.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController]
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: HTMLElement): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: Null,
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(insertIndex: Double, component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insert(
    insertIndex: Double,
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  
  /**
    * Inserts an array of components into the navigation stack at the specified index. The last component in the array will become instantiated as a view, and animate in to become the active view.
    * @param insertIndex The index to insert the components at in the stack.
    * @param insertComponents The components to insert into the navigation stack.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def insertPages(insertIndex: Double, insertComponents: js.Array[NavComponent | NavComponentWithProps[_]]): js.Promise[Boolean] = js.native
  def insertPages(
    insertIndex: Double,
    insertComponents: js.Array[NavComponent | NavComponentWithProps[_]],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insertPages(
    insertIndex: Double,
    insertComponents: js.Array[NavComponent | NavComponentWithProps[_]],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def insertPages(
    insertIndex: Double,
    insertComponents: js.Array[NavComponent | NavComponentWithProps[_]],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def insertPages(
    insertIndex: Double,
    insertComponents: js.Array[NavComponent | NavComponentWithProps[_]],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  
  /**
    * Pop a component off of the navigation stack. Navigates back from the current component.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def pop(): js.Promise[Boolean] = js.native
  def pop(opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def pop(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def pop(opts: NavOptions): js.Promise[Boolean] = js.native
  def pop(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  
  /**
    * Pop to a specific index in the navigation stack.
    * @param indexOrViewCtrl The index or view controller to pop to.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def popTo(indexOrViewCtrl: Double): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: Double, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: Double, opts: NavOptions): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: ViewController): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: ViewController, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: ViewController, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: ViewController, opts: NavOptions): js.Promise[Boolean] = js.native
  def popTo(indexOrViewCtrl: ViewController, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  
  /**
    * Navigate back to the root of the stack, no matter how far back that is.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def popToRoot(): js.Promise[Boolean] = js.native
  def popToRoot(opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popToRoot(opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def popToRoot(opts: NavOptions): js.Promise[Boolean] = js.native
  def popToRoot(opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  
  def push(): js.Promise[Boolean] = js.native
  def push(component: String): js.Promise[Boolean] = js.native
  def push(
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: js.UndefOr[scala.Nothing], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: Null, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
  def push(
    component: String,
    componentProps: ComponentProps[String],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: String,
    componentProps: ComponentProps[String],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  /**
    * Push a new component onto the current navigation stack. Pass any additional information along as an object. This additional information is accessible through NavParams.
    * @param component The component to push onto the navigation stack.
    * @param componentProps Any properties of the component.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def push(component: js.Function): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: js.UndefOr[scala.Nothing], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: Null, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
  def push(
    component: Null,
    componentProps: ComponentProps[Null],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: typingsSlinky.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController]
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def push(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: HTMLElement): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def push(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
  def push(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  
  /**
    * Removes a component from the navigation stack at the specified index.
    * @param startIndex The number to begin removal at.
    * @param removeCount The number of components to remove.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def removeIndex(startIndex: Double): js.Promise[Boolean] = js.native
  def removeIndex(
    startIndex: Double,
    removeCount: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: js.UndefOr[scala.Nothing], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def removeIndex(
    startIndex: Double,
    removeCount: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: Double): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: Double, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: Double, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions): js.Promise[Boolean] = js.native
  def removeIndex(startIndex: Double, removeCount: Double, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  
  /**
    * Root NavComponent to load
    */
  var root: js.UndefOr[NavComponent] = js.native
  
  /**
    * Any parameters for the root component
    */
  var rootParams: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * Set the views of the current navigation stack and navigate to the last view. By default animations are disabled, but they can be enabled by passing options to the navigation controller. Navigation parameters can also be passed to the individual pages in the array.
    * @param views The list of views to set as the navigation stack.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def setPages(views: js.Array[NavComponent | NavComponentWithProps[_]]): js.Promise[Boolean] = js.native
  def setPages(
    views: js.Array[NavComponent | NavComponentWithProps[_]],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setPages(views: js.Array[NavComponent | NavComponentWithProps[_]], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setPages(views: js.Array[NavComponent | NavComponentWithProps[_]], opts: NavOptions): js.Promise[Boolean] = js.native
  def setPages(views: js.Array[NavComponent | NavComponentWithProps[_]], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  
  def setRoot(): js.Promise[Boolean] = js.native
  def setRoot(component: String): js.Promise[Boolean] = js.native
  def setRoot(
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: js.UndefOr[scala.Nothing], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: String,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: Null, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: ComponentProps[String]): js.Promise[Boolean] = js.native
  def setRoot(
    component: String,
    componentProps: ComponentProps[String],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: ComponentProps[String], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: String, componentProps: ComponentProps[String], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: String,
    componentProps: ComponentProps[String],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  /**
    * Set the root for the current navigation stack to a component.
    * @param component The component to set as the root of the navigation stack.
    * @param componentProps Any properties of the component.
    * @param opts The navigation options.
    * @param done The transition complete function.
    */
  def setRoot(component: js.Function): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: ComponentProps[js.Function]): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: js.Function, componentProps: ComponentProps[js.Function], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: js.Function,
    componentProps: ComponentProps[js.Function],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: js.UndefOr[scala.Nothing], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: Null,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: Null, opts: js.UndefOr[scala.Nothing], done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: ComponentProps[Null]): js.Promise[Boolean] = js.native
  def setRoot(
    component: Null,
    componentProps: ComponentProps[Null],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: ComponentProps[Null], opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(component: Null, componentProps: ComponentProps[Null], opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: typingsSlinky.ionicCore.viewControllerMod.ViewController): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: Null,
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController]
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: typingsSlinky.ionicCore.viewControllerMod.ViewController,
    componentProps: ComponentProps[typingsSlinky.ionicCore.viewControllerMod.ViewController],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: js.UndefOr[scala.Nothing], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: js.UndefOr[scala.Nothing],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: Null,
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: Null, opts: Null, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: Null, opts: NavOptions, done: TransitionDoneFn): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement]): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: js.UndefOr[scala.Nothing],
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: Null,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  def setRoot(component: HTMLElement, componentProps: ComponentProps[HTMLElement], opts: NavOptions): js.Promise[Boolean] = js.native
  def setRoot(
    component: HTMLElement,
    componentProps: ComponentProps[HTMLElement],
    opts: NavOptions,
    done: TransitionDoneFn
  ): js.Promise[Boolean] = js.native
  
  def setRouteId(id: String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(
    id: String,
    params: js.UndefOr[scala.Nothing],
    direction: RouterDirection,
    animation: AnimationBuilder
  ): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(id: String, params: ComponentProps[Null], direction: RouterDirection, animation: AnimationBuilder): js.Promise[RouteWrite] = js.native
  
  /**
    * If the nav component should allow for swipe-to-go-back.
    */
  var swipeGesture: js.UndefOr[Boolean] = js.native
}
