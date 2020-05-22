organization := "org.scalablytyped.slinky"
name := "firebase__database"
version := "0.6.2-b8a05f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.5",
  "org.scalablytyped.slinky" %%% "firebase__app-types" % "0.6.0-d23c04",
  "org.scalablytyped.slinky" %%% "firebase__auth-interop-types" % "0.1.4-53d55d",
  "org.scalablytyped.slinky" %%% "firebase__component" % "0.1.11-f4538d",
  "org.scalablytyped.slinky" %%% "firebase__database-types" % "0.5.0-38f31c",
  "org.scalablytyped.slinky" %%% "firebase__logger" % "0.2.3-3efe92",
  "org.scalablytyped.slinky" %%% "firebase__util" % "0.2.46-4579be",
  "org.scalablytyped.slinky" %%% "std" % "3.9-c21af0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
