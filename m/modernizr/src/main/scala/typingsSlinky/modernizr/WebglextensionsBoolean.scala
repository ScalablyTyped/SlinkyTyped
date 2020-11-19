package typingsSlinky.modernizr

import typingsSlinky.std.Boolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebglextensionsBoolean extends Boolean {
  
  var ANGLE_instanced_arrays: scala.Boolean = js.native
  
  var EXT_blend_minmax: scala.Boolean = js.native
  
  var EXT_disjoint_timer_query: scala.Boolean = js.native
  
  var EXT_frag_depth: scala.Boolean = js.native
  
  var EXT_sRGB: scala.Boolean = js.native
  
  var EXT_shader_texture_lod: scala.Boolean = js.native
  
  var EXT_texture_filter_anisotropic: scala.Boolean = js.native
  
  var OES_element_index_uint: scala.Boolean = js.native
  
  var OES_standard_derivatives: scala.Boolean = js.native
  
  var OES_texture_float: scala.Boolean = js.native
  
  var OES_texture_float_linear: scala.Boolean = js.native
  
  var OES_texture_half_float: scala.Boolean = js.native
  
  var OES_texture_half_float_linear: scala.Boolean = js.native
  
  var OES_vertex_array_object: scala.Boolean = js.native
  
  var WEBGL_compressed_texture_etc1: scala.Boolean = js.native
  
  var WEBGL_compressed_texture_s3tc: scala.Boolean = js.native
  
  var WEBGL_debug_renderer_info: scala.Boolean = js.native
  
  var WEBGL_debug_shaders: scala.Boolean = js.native
  
  var WEBGL_depth_texture: scala.Boolean = js.native
  
  var WEBGL_draw_buffers: scala.Boolean = js.native
  
  var WEBGL_lose_context: scala.Boolean = js.native
  
  var WEBKIT_EXT_texture_filter_anisotropic: scala.Boolean = js.native
  
  var WEBKIT_WEBGL_compressed_texture_s3tc: scala.Boolean = js.native
  
  var WEBKIT_WEBGL_depth_texture: scala.Boolean = js.native
  
  var WEBKIT_WEBGL_lose_context: scala.Boolean = js.native
}
object WebglextensionsBoolean {
  
  @scala.inline
  def apply(
    ANGLE_instanced_arrays: scala.Boolean,
    EXT_blend_minmax: scala.Boolean,
    EXT_disjoint_timer_query: scala.Boolean,
    EXT_frag_depth: scala.Boolean,
    EXT_sRGB: scala.Boolean,
    EXT_shader_texture_lod: scala.Boolean,
    EXT_texture_filter_anisotropic: scala.Boolean,
    OES_element_index_uint: scala.Boolean,
    OES_standard_derivatives: scala.Boolean,
    OES_texture_float: scala.Boolean,
    OES_texture_float_linear: scala.Boolean,
    OES_texture_half_float: scala.Boolean,
    OES_texture_half_float_linear: scala.Boolean,
    OES_vertex_array_object: scala.Boolean,
    WEBGL_compressed_texture_etc1: scala.Boolean,
    WEBGL_compressed_texture_s3tc: scala.Boolean,
    WEBGL_debug_renderer_info: scala.Boolean,
    WEBGL_debug_shaders: scala.Boolean,
    WEBGL_depth_texture: scala.Boolean,
    WEBGL_draw_buffers: scala.Boolean,
    WEBGL_lose_context: scala.Boolean,
    WEBKIT_EXT_texture_filter_anisotropic: scala.Boolean,
    WEBKIT_WEBGL_compressed_texture_s3tc: scala.Boolean,
    WEBKIT_WEBGL_depth_texture: scala.Boolean,
    WEBKIT_WEBGL_lose_context: scala.Boolean
  ): WebglextensionsBoolean = {
    val __obj = js.Dynamic.literal(ANGLE_instanced_arrays = ANGLE_instanced_arrays.asInstanceOf[js.Any], EXT_blend_minmax = EXT_blend_minmax.asInstanceOf[js.Any], EXT_disjoint_timer_query = EXT_disjoint_timer_query.asInstanceOf[js.Any], EXT_frag_depth = EXT_frag_depth.asInstanceOf[js.Any], EXT_sRGB = EXT_sRGB.asInstanceOf[js.Any], EXT_shader_texture_lod = EXT_shader_texture_lod.asInstanceOf[js.Any], EXT_texture_filter_anisotropic = EXT_texture_filter_anisotropic.asInstanceOf[js.Any], OES_element_index_uint = OES_element_index_uint.asInstanceOf[js.Any], OES_standard_derivatives = OES_standard_derivatives.asInstanceOf[js.Any], OES_texture_float = OES_texture_float.asInstanceOf[js.Any], OES_texture_float_linear = OES_texture_float_linear.asInstanceOf[js.Any], OES_texture_half_float = OES_texture_half_float.asInstanceOf[js.Any], OES_texture_half_float_linear = OES_texture_half_float_linear.asInstanceOf[js.Any], OES_vertex_array_object = OES_vertex_array_object.asInstanceOf[js.Any], WEBGL_compressed_texture_etc1 = WEBGL_compressed_texture_etc1.asInstanceOf[js.Any], WEBGL_compressed_texture_s3tc = WEBGL_compressed_texture_s3tc.asInstanceOf[js.Any], WEBGL_debug_renderer_info = WEBGL_debug_renderer_info.asInstanceOf[js.Any], WEBGL_debug_shaders = WEBGL_debug_shaders.asInstanceOf[js.Any], WEBGL_depth_texture = WEBGL_depth_texture.asInstanceOf[js.Any], WEBGL_draw_buffers = WEBGL_draw_buffers.asInstanceOf[js.Any], WEBGL_lose_context = WEBGL_lose_context.asInstanceOf[js.Any], WEBKIT_EXT_texture_filter_anisotropic = WEBKIT_EXT_texture_filter_anisotropic.asInstanceOf[js.Any], WEBKIT_WEBGL_compressed_texture_s3tc = WEBKIT_WEBGL_compressed_texture_s3tc.asInstanceOf[js.Any], WEBKIT_WEBGL_depth_texture = WEBKIT_WEBGL_depth_texture.asInstanceOf[js.Any], WEBKIT_WEBGL_lose_context = WEBKIT_WEBGL_lose_context.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebglextensionsBoolean]
  }
  
  @scala.inline
  implicit class WebglextensionsBooleanOps[Self <: WebglextensionsBoolean] (val x: Self) extends AnyVal {
    
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
    def setANGLE_instanced_arrays(value: scala.Boolean): Self = this.set("ANGLE_instanced_arrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_blend_minmax(value: scala.Boolean): Self = this.set("EXT_blend_minmax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_disjoint_timer_query(value: scala.Boolean): Self = this.set("EXT_disjoint_timer_query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_frag_depth(value: scala.Boolean): Self = this.set("EXT_frag_depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_sRGB(value: scala.Boolean): Self = this.set("EXT_sRGB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_shader_texture_lod(value: scala.Boolean): Self = this.set("EXT_shader_texture_lod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEXT_texture_filter_anisotropic(value: scala.Boolean): Self = this.set("EXT_texture_filter_anisotropic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_element_index_uint(value: scala.Boolean): Self = this.set("OES_element_index_uint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_standard_derivatives(value: scala.Boolean): Self = this.set("OES_standard_derivatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_texture_float(value: scala.Boolean): Self = this.set("OES_texture_float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_texture_float_linear(value: scala.Boolean): Self = this.set("OES_texture_float_linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_texture_half_float(value: scala.Boolean): Self = this.set("OES_texture_half_float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_texture_half_float_linear(value: scala.Boolean): Self = this.set("OES_texture_half_float_linear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOES_vertex_array_object(value: scala.Boolean): Self = this.set("OES_vertex_array_object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_compressed_texture_etc1(value: scala.Boolean): Self = this.set("WEBGL_compressed_texture_etc1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_compressed_texture_s3tc(value: scala.Boolean): Self = this.set("WEBGL_compressed_texture_s3tc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_debug_renderer_info(value: scala.Boolean): Self = this.set("WEBGL_debug_renderer_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_debug_shaders(value: scala.Boolean): Self = this.set("WEBGL_debug_shaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_depth_texture(value: scala.Boolean): Self = this.set("WEBGL_depth_texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_draw_buffers(value: scala.Boolean): Self = this.set("WEBGL_draw_buffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBGL_lose_context(value: scala.Boolean): Self = this.set("WEBGL_lose_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBKIT_EXT_texture_filter_anisotropic(value: scala.Boolean): Self = this.set("WEBKIT_EXT_texture_filter_anisotropic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBKIT_WEBGL_compressed_texture_s3tc(value: scala.Boolean): Self = this.set("WEBKIT_WEBGL_compressed_texture_s3tc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBKIT_WEBGL_depth_texture(value: scala.Boolean): Self = this.set("WEBKIT_WEBGL_depth_texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEBKIT_WEBGL_lose_context(value: scala.Boolean): Self = this.set("WEBKIT_WEBGL_lose_context", value.asInstanceOf[js.Any])
  }
}
