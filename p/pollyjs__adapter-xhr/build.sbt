organization := "org.scalablytyped.slinky"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20200515Z-1828e1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "pollyjs__adapter" % "4.3-dt-20200526Z-8264d2",
  "org.scalablytyped.slinky" %%% "pollyjs__core" % "4.3-dt-20200526Z-d1280a",
  "org.scalablytyped.slinky" %%% "pollyjs__persister" % "4.3-dt-20200526Z-03ecc6",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
