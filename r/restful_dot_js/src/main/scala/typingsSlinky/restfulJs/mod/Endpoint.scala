package typingsSlinky.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Endpoint[Self] extends js.Object {
  /**
    * Add a full request interceptor. You can alter params, headers, data, method and url.
    */
  def addFullRequestInterceptor(interceptor: FullRequestInterceptor): Self = js.native
  /**
    * Add a full response interceptor. You can alter data and headers.
    */
  def addFullResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
  /**
    * Add a request interceptor.
    */
  def addRequestInterceptor(interceptor: RequestInterceptor): Self = js.native
  /**
    * Add a response interceptor. You can only alter data and headers.
    */
  def addResponseInterceptor(interceptor: ResponseInterceptor): Self = js.native
  def fullRequestInterceptors(): js.Array[FullRequestInterceptor] = js.native
  def fullResponseInterceptors(): js.Array[ResponseInterceptor] = js.native
  /**
    * Add a header.
    * @param name
    * @param value
    */
  def header(name: String, value: js.Any): Self = js.native
  def headers(): Headers = js.native
  def requestInterceptors(): js.Array[RequestInterceptor] = js.native
  def responseInterceptors(): js.Array[ResponseInterceptor] = js.native
  /**
    * Get the url.
    */
  def url(): String = js.native
}

object Endpoint {
  @scala.inline
  def apply[Self](
    addFullRequestInterceptor: FullRequestInterceptor => Self,
    addFullResponseInterceptor: ResponseInterceptor => Self,
    addRequestInterceptor: RequestInterceptor => Self,
    addResponseInterceptor: ResponseInterceptor => Self,
    fullRequestInterceptors: () => js.Array[FullRequestInterceptor],
    fullResponseInterceptors: () => js.Array[ResponseInterceptor],
    header: (String, js.Any) => Self,
    headers: () => Headers,
    requestInterceptors: () => js.Array[RequestInterceptor],
    responseInterceptors: () => js.Array[ResponseInterceptor],
    url: () => String
  ): Endpoint[Self] = {
    val __obj = js.Dynamic.literal(addFullRequestInterceptor = js.Any.fromFunction1(addFullRequestInterceptor), addFullResponseInterceptor = js.Any.fromFunction1(addFullResponseInterceptor), addRequestInterceptor = js.Any.fromFunction1(addRequestInterceptor), addResponseInterceptor = js.Any.fromFunction1(addResponseInterceptor), fullRequestInterceptors = js.Any.fromFunction0(fullRequestInterceptors), fullResponseInterceptors = js.Any.fromFunction0(fullResponseInterceptors), header = js.Any.fromFunction2(header), headers = js.Any.fromFunction0(headers), requestInterceptors = js.Any.fromFunction0(requestInterceptors), responseInterceptors = js.Any.fromFunction0(responseInterceptors), url = js.Any.fromFunction0(url))
    __obj.asInstanceOf[Endpoint[Self]]
  }
  @scala.inline
  implicit class EndpointOps[Self_[self] <: Endpoint[self], Self] (val x: Self_[Self]) extends AnyVal {
    @scala.inline
    def duplicate: Self_[Self] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self_[Self]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self_[Self] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self_[Self] with Other]
    @scala.inline
    def withAddFullRequestInterceptor(value: FullRequestInterceptor => Self): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFullRequestInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddFullResponseInterceptor(value: ResponseInterceptor => Self): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFullResponseInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddRequestInterceptor(value: RequestInterceptor => Self): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRequestInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddResponseInterceptor(value: ResponseInterceptor => Self): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResponseInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFullRequestInterceptors(value: () => js.Array[FullRequestInterceptor]): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullRequestInterceptors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFullResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullResponseInterceptors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeader(value: (String, js.Any) => Self): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeaders(value: () => Headers): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRequestInterceptors(value: () => js.Array[RequestInterceptor]): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestInterceptors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResponseInterceptors(value: () => js.Array[ResponseInterceptor]): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseInterceptors")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: () => String): Self_[Self] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

