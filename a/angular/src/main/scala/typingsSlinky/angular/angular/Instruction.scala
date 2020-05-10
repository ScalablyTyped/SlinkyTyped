package typingsSlinky.angular.angular

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Instruction` is a tree of {@link ComponentInstruction}s with all the information needed
  * to transition each component in the app to a given route, including all auxiliary routes.
  *
  * `Instruction`s can be created using {@link Router#generate}, and can be used to
  * perform route changes with {@link Router#navigateByInstruction}.
  *
  * ### Example
  *
  * ```
  * import { Component } from 'angular2/core';
  * import {bootstrap} from 'angular2/platform/browser';
  * import {Router, ROUTER_DIRECTIVES, ROUTER_PROVIDERS, RouteConfig} from 'angular2/router';
  *
  * @Component({directives: [ROUTER_DIRECTIVES]})
  * @RouteConfig([
  *  {...},
  * ])
  * class AppCmp {
  *   constructor(router: Router) {
  *     var instruction = router.generate(['/MyRoute']);
  *     router.navigateByInstruction(instruction);
  *   }
  * }
  *
  * bootstrap(AppCmp, ROUTER_PROVIDERS);
  * ```
  */
@js.native
trait Instruction extends js.Object {
  var auxInstruction: StringDictionary[Instruction] = js.native
  var child: Instruction = js.native
  var component: ComponentInstruction = js.native
  /**
    * Returns a new instruction that shares the state of the existing instruction, but with
    * the given child {@link Instruction} replacing the existing child.
    */
  def replaceChild(child: Instruction): Instruction = js.native
  def resolveComponent(): js.Any = js.native
  def specificity(): Double = js.native
  /**
    * default instructions override these
    */
  def toLinkUrl(): String = js.native
  /**
    * converts the instruction into a URL string
    */
  def toRootUrl(): String = js.native
  /**
    * If the final URL for the instruction is ``
    */
  def toUrlPath(): String = js.native
  def toUrlQuery(): String = js.native
  def urlParams(): js.Array[String] = js.native
  def urlPath(): String = js.native
}

object Instruction {
  @scala.inline
  def apply(
    auxInstruction: StringDictionary[Instruction],
    child: Instruction,
    component: ComponentInstruction,
    replaceChild: Instruction => Instruction,
    resolveComponent: () => js.Any,
    specificity: () => Double,
    toLinkUrl: () => String,
    toRootUrl: () => String,
    toUrlPath: () => String,
    toUrlQuery: () => String,
    urlParams: () => js.Array[String],
    urlPath: () => String
  ): Instruction = {
    val __obj = js.Dynamic.literal(auxInstruction = auxInstruction.asInstanceOf[js.Any], child = child.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], replaceChild = js.Any.fromFunction1(replaceChild), resolveComponent = js.Any.fromFunction0(resolveComponent), specificity = js.Any.fromFunction0(specificity), toLinkUrl = js.Any.fromFunction0(toLinkUrl), toRootUrl = js.Any.fromFunction0(toRootUrl), toUrlPath = js.Any.fromFunction0(toUrlPath), toUrlQuery = js.Any.fromFunction0(toUrlQuery), urlParams = js.Any.fromFunction0(urlParams), urlPath = js.Any.fromFunction0(urlPath))
    __obj.asInstanceOf[Instruction]
  }
  @scala.inline
  implicit class InstructionOps[Self <: Instruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuxInstruction(value: StringDictionary[Instruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auxInstruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChild(value: Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("child")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ComponentInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceChild(value: Instruction => Instruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolveComponent(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveComponent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpecificity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specificity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToLinkUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLinkUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToRootUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toRootUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToUrlPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUrlPath")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToUrlQuery(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUrlQuery")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrlParams(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlParams")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrlPath(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPath")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

