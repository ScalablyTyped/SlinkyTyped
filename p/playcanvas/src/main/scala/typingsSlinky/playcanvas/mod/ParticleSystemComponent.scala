package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ParticleSystemComponent.
  * @property autoPlay - Controls whether the particle system plays automatically on creation. If set to false, it is necessary to call {@link pc.ParticleSystemComponent#play} for the particle system to play. Defaults to true.
  * @property loop - Enables or disables respawning of particles.
  * @property preWarm - If enabled, the particle system will be initialized as though it had already completed a full cycle. This only works with looping particle systems.
  * @property lighting - If enabled, particles will be lit by ambient and directional lights.
  * @property halfLambert - Enabling Half Lambert lighting avoids particles looking too flat in shadowed areas. It is a completely non-physical lighting model but can give more pleasing visual results.
  * @property alignToMotion - Orient particles in their direction of motion.
  * @property depthWrite - If enabled, the particles will write to the depth buffer. If disabled, the depth buffer is left unchanged and particles will be guaranteed to overwrite one another in the order in which they are rendered.
  * @property noFog - Disable fogging.
  * @property localSpace - Binds particles to emitter transformation rather then world space.
  * @property screenSpace - Renders particles in 2D screen space. This needs to be set when particle system is part of hierarchy with {@link pc.ScreenComponent} as its ancestor, and allows particle system to integrate with the rendering of {@link pc.ElementComponent}s. Note that an entity with ParticleSystem component cannot be parented directly to {@link pc.ScreenComponent}, but has to be a child of a {@link pc.ElementComponent}, for example {@link pc.LayoutGroupComponent}.
  * @property numParticles - Maximum number of simulated particles.
  * @property rate - Minimal interval in seconds between particle births.
  * @property rate2 - Maximal interval in seconds between particle births.
  * @property startAngle - Minimal initial Euler angle of a particle.
  * @property startAngle2 - Maximal initial Euler angle of a particle.
  * @property lifetime - The length of time in seconds between a particle's birth and its death.
  * @property stretch - A value in world units that controls the amount by which particles are stretched based on their velocity. Particles are stretched from their center towards their previous position.
  * @property intensity - Color multiplier.
  * @property animLoop - Controls whether the sprite sheet animation plays once or loops continuously.
  * @property animTilesX - Number of horizontal tiles in the sprite sheet.
  * @property animTilesY - Number of vertical tiles in the sprite sheet.
  * @property animNumAnimations - Number of sprite sheet animations contained within the current sprite sheet. The number of animations multiplied by number of frames should be a value less than animTilesX multiplied by animTilesY.
  * @property animNumFrames - Number of sprite sheet frames in the current sprite sheet animation. The number of animations multiplied by number of frames should be a value less than animTilesX multiplied by animTilesY.
  * @property animStartFrame - The sprite sheet frame that the animation should begin playing from. Indexed from the start of the current animation.
  * @property animIndex - When animNumAnimations is greater than 1, the sprite sheet animation index determines which animation the particle system should play.
  * @property randomizeAnimIndex - Each particle emitted by the system will play a random animation from the sprite sheet, up to animNumAnimations.
  * @property animSpeed - Sprite sheet animation speed. 1 = particle lifetime, 2 = twice during lifetime etc...
  * @property depthSoftening - Controls fading of particles near their intersections with scene geometry. This effect, when it's non-zero, requires scene depth map to be rendered. Multiple depth-dependent effects can share the same map, but if you only use it for particles, bear in mind that it can double engine draw calls.
  * @property initialVelocity - Defines magnitude of the initial emitter velocity. Direction is given by emitter shape.
  * @property emitterExtents - (Only for EMITTERSHAPE_BOX) The extents of a local space bounding box within which particles are spawned at random positions.
  * @property emitterExtentsInner - (Only for EMITTERSHAPE_BOX) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
  * @property emitterRadius - (Only for EMITTERSHAPE_SPHERE) The radius within which particles are spawned at random positions.
  * @property emitterRadiusInner - (Only for EMITTERSHAPE_SPHERE) The inner radius within which particles are not spawned.
  * @property wrapBounds - The half extents of a world space box volume centered on the owner entity's position. If a particle crosses the boundary of one side of the volume, it teleports to the opposite side.
  * @property colorMapAsset - The {@link pc.Asset} used to set the colorMap.
  * @property normalMapAsset - The {@link pc.Asset} used to set the normalMap.
  * @property meshAsset - The {@link pc.Asset} used to set the mesh.
  * @property colorMap - The color map texture to apply to all particles in the system. If no texture is assigned, a default spot texture is used.
  * @property normalMap - The normal map texture to apply to all particles in the system. If no texture is assigned, an approximate spherical normal is calculated for each vertex.
  * @property emitterShape - Shape of the emitter. Defines the bounds inside which particles are spawned. Also affects the direction of initial velocity.
  *
  * * {@link pc.EMITTERSHAPE_BOX}: Box shape parameterized by emitterExtents. Initial velocity is directed towards local Z axis.
  * * {@link pc.EMITTERSHAPE_SPHERE}: Sphere shape parameterized by emitterRadius. Initial velocity is directed outwards from the center.
  * @property sort - Sorting mode. Forces CPU simulation, so be careful.
  *
  * * {@link pc.PARTICLESORT_NONE}: No sorting, particles are drawn in arbitrary order. Can be simulated on GPU.
  * * {@link pc.PARTICLESORT_DISTANCE}: Sorting based on distance to the camera. CPU only.
  * * {@link pc.PARTICLESORT_NEWER_FIRST}: Newer particles are drawn first. CPU only.
  * * {@link pc.PARTICLESORT_OLDER_FIRST}: Older particles are drawn first. CPU only.
  * @property mesh - Triangular mesh to be used as a particle. Only first vertex/index buffer is used. Vertex buffer must contain local position at first 3 floats of each vertex.
  * @property blend - Controls how particles are blended when being written to the currently active render target.
  * Can be:
  *
  * * {@link pc.BLEND_SUBTRACTIVE}: Subtract the color of the source fragment from the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_ADDITIVE}: Add the color of the source fragment to the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_NORMAL}: Enable simple translucency for materials such as glass. This is equivalent to enabling a source blend mode of pc.BLENDMODE_SRC_ALPHA and a destination blend mode of pc.BLENDMODE_ONE_MINUS_SRC_ALPHA.
  * * {@link pc.BLEND_NONE}: Disable blending.
  * * {@link pc.BLEND_PREMULTIPLIED}: Similar to pc.BLEND_NORMAL expect the source fragment is assumed to have already been multiplied by the source alpha value.
  * * {@link pc.BLEND_MULTIPLICATIVE}: Multiply the color of the source fragment by the color of the destination fragment and write the result to the frame buffer.
  * * {@link pc.BLEND_ADDITIVEALPHA}: Same as pc.BLEND_ADDITIVE except the source RGB is multiplied by the source alpha.
  * @property orientation - Sorting mode. Forces CPU simulation, so be careful.
  *
  * * {@link pc.PARTICLEORIENTATION_SCREEN}: Particles are facing camera.
  * * {@link pc.PARTICLEORIENTATION_WORLD}: User defines world space normal (particleNormal) to set planes orientation.
  * * {@link pc.PARTICLEORIENTATION_EMITTER}: Similar to previous, but the normal is affected by emitter(entity) transformation.
  * @property particleNormal - (Only for PARTICLEORIENTATION_WORLD and PARTICLEORIENTATION_EMITTER) The exception of extents of a local space bounding box within which particles are not spawned. Aligned to the center of EmitterExtents.
  * @property localVelocityGraph - Velocity relative to emitter over lifetime.
  * @property localVelocityGraph2 - If not null, particles pick random values between localVelocityGraph and localVelocityGraph2.
  * @property velocityGraph - World-space velocity over lifetime.
  * @property velocityGraph2 - If not null, particles pick random values between velocityGraph and velocityGraph2.
  * @property colorGraph - Color over lifetime.
  * @property rotationSpeedGraph - Rotation speed over lifetime.
  * @property rotationSpeedGraph2 - If not null, particles pick random values between rotationSpeedGraph and rotationSpeedGraph2.
  * @property radialSpeedGraph - Radial speed over lifetime, velocity vector points from emitter origin to particle pos.
  * @property radialSpeedGraph2 - If not null, particles pick random values between radialSpeedGraph and radialSpeedGraph2.
  * @property scaleGraph - Scale over lifetime.
  * @property scaleGraph2 - If not null, particles pick random values between scaleGraph and scaleGraph2.
  * @property alphaGraph - Alpha over lifetime.
  * @property alphaGraph2 - If not null, particles pick random values between alphaGraph and alphaGraph2.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this particle system should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity this Component is attached to.
  */
@JSImport("playcanvas", "ParticleSystemComponent")
@js.native
class ParticleSystemComponent protected ()
  extends typingsSlinky.playcanvas.pc.ParticleSystemComponent {
  def this(
    system: typingsSlinky.playcanvas.pc.ParticleSystemComponentSystem,
    entity: typingsSlinky.playcanvas.pc.Entity
  ) = this()
}
